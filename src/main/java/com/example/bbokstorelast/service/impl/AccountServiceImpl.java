package com.example.bbokstorelast.service.impl;

import com.example.bbokstorelast.model.dto.request.SignUpRequestDTO;
import com.example.bbokstorelast.model.entity.Account;
import com.example.bbokstorelast.model.entity.Role;
import com.example.bbokstorelast.model.enums.ERole;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.bbokstorelast.repository.AccountRepository;
import com.example.bbokstorelast.repository.RoleRepository;
import com.example.bbokstorelast.service.AccountService;
import com.example.bbokstorelast.service.RoleService;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    private final RoleService roleService;

    private final AccountMapper accountMapper;

    private final RoleRepository roleRepository;


    @Override
    public Account add(SignUpRequestDTO signUpRequestDTO) {
        Role role = roleService.findByName(ERole.USER);

        if(!accountRepository.existsByUsername(signUpRequestDTO.getUsername())) {
            Account account = accountMapper.signUpRequestDTOtoAccount(signUpRequestDTO);
            return accountRepository.save(account);
        }
        throw new RuntimeException("Account not saved");
    }

    @Override
    public Account getAccountByUsername(String username){
        return accountRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("account not found"));
    }

    @Override
    public boolean updateUsername(Long id, String username) {
        return false;
    }

    @Override
    public boolean updatePassword(Long id, String password) {
        return false;
    }
}