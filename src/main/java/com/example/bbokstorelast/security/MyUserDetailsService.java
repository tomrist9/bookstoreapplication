package com.example.bbokstorelast.security;

import com.example.bbokstorelast.model.entity.Account;
import com.example.bbokstorelast.repository.AccountRepository;
import com.example.bbokstorelast.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      Account account= new accountService.getAccountByUsername(username);
        return new MyUserDetail(account) ;
    }
}
