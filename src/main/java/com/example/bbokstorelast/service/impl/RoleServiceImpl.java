package com.example.bbokstorelast.service.impl;

import com.example.bbokstorelast.model.entity.Role;
import com.example.bbokstorelast.model.enums.ERole;
import com.example.bbokstorelast.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.bbokstorelast.repository.RoleRepository;


@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;


    @Override
    public Role findByName(ERole roleName) {
        return roleRepository.findByRoleName(roleName).orElseThrow();
    }
}