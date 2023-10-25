package com.example.bbokstorelast.service.impl;

import com.example.bbokstorelast.model.entity.Account;
import com.example.bbokstorelast.model.entity.User;
import com.example.bbokstorelast.repository.UserRepository;
import com.example.bbokstorelast.service.AccountService;
import com.example.bbokstorelast.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final AccountService accountService;
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @Override
    public boolean addUser(@Valid SignUpRequestDTO signUpRequestDTO){
       Account account= accountService.add(signUpRequestDTO);
       User user=User.builder()
               .firstName(signUpRequestDTO.getFirstName())
               .lastName(signUpRequestDTO.getLastName())
               .contactNumber(signUpRequestDTO.getContactNumber())
               .email(signUpRequestDTO.getEmail())
               .account(account)
               .build();
         userRepository.save(user);
         return true;
    }

    @Override
    public List<User> getAllUsers(int page, int size) {
        Pageable paging= PageRequest.of(page, size);
        return userRepository.findAll(paging).getContent();
    }
}
