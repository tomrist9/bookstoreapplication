package com.example.bbokstorelast.service;

import com.example.bbokstorelast.model.entity.Role;
import com.example.bbokstorelast.model.enums.ERole;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    Role findByName(ERole roleName);

}
