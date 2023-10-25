package com.example.bbokstorelast.controller;

import com.example.bbokstorelast.model.dto.request.SignUpRequestDTO;
import com.example.bbokstorelast.model.entity.User;
import com.example.bbokstorelast.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public boolean addUser(@RequestBody @Valid SignUpRequestDTO signUpRequestDTO){
        return userService.addUser(signUpRequestDTO);
    }
    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> getAllUsers(@RequestParam(defaultValue = "0")int page,
                                  @RequestParam(defaultValue ="3" )int size
                                  ){
        return userService.getAllUsers(page,size);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @GetMapping("/username")
    public User getUserByUsername(
            @RequestParam String username
    ){
        return userService.getUserByUsername(username);
    }
    @PostMapping("/{id}")
    public boolean updateUser(@PathVariable Long id){
        return userService.addUser(id);
    }
@DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable Long id) {
    return userService.deleteUser(id);
}
@PatchMapping("/{id}/add-role")
    public boolean addRoleFromUser(@PathVariable Long id,
                                      @RequestParam String roleName){
        return userService.addRoleToUser(id, roleName);
}
    @PatchMapping("/{id}/delete-role")
    public boolean deleteRoleFromUser(@PathVariable Long id,
                                      @RequestParam String roleName){
        return userService.addRoleToUser(id, roleName);
    }
}
