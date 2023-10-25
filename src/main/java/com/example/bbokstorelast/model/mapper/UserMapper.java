package com.example.bbokstorelast.model.mapper;

import com.example.bbokstorelast.model.dto.request.SignUpRequestDTO;
import com.example.bbokstorelast.model.dto.response.UserResponseDTO;
import com.example.bbokstorelast.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User signUpRequestDTOtoUser(SignUpRequestDTO signUpRequestDTO);
    UserResponseDTO userToUserResponseDTO(User user);
}
