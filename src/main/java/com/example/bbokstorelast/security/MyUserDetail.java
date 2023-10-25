package com.example.bbokstorelast.security;

import com.example.bbokstorelast.model.entity.Account;
import com.example.bbokstorelast.model.entity.Role;
import com.example.bbokstorelast.repository.AccountRepository;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MyUserDetail implements UserDetails {

    @Getter
    Long id;
    String username;
    String password;
    boolean isActive;
    Set<Role> roles;

    public MyUserDetail(Account account){
        this.id= account.getId();
        this.username=account.getUsername();
        this.password=account.getPassword();
        this.roles=account.getRoles();
        this.isActive=account.isActive();
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getRoleName().toString()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return this.password
                ;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.isActive;
    }
}
