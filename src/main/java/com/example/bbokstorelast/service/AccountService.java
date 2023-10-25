package com.example.bbokstorelast.service;

import com.example.bbokstorelast.model.entity.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    Account add(SignUpRequestDTO signUpRequestDTO);

    Account getAccountByUsername(String username);

    boolean updateUsername(Long id, String username);

    boolean updatePassword(Long id, String password);

}
