package com.example.bbokstorelast.service;

import com.example.bbokstorelast.model.entity.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {



    boolean addUser(@Valid SignUpRequestDTO signUpRequestDTO);


    List<User> getAllUsers(int page, int size);
    User getUserById(Long id);
    User getUserByUsername(String username);
    boolean updateUser(Long id,  UserRequestDTO userRequestDTO);
    boolean deleteUser(Long id);
    boolean addRoleToUser(Long id, String roleName);
    boolean deleteRoleFromUser(Long id, String roleName);



    boolean addUser(Long id);
}
