package com.example.bbokstorelast.model.mapper;

import com.example.bbokstorelast.model.dto.request.SignUpRequestDTO;
import com.example.bbokstorelast.model.dto.response.AccountResponseDTO;
import com.example.bbokstorelast.model.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    @Mapping(target="username", source = "signUpRequestDTO.username")
    Account signUpRequestDTO(SignUpRequestDTO signUpRequestDTO);
    AccountResponseDTO accountToAccountResponseDTO(Account account);
}

