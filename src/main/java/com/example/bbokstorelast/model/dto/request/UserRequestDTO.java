package com.example.bbokstorelast.model.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class UserRequestDTO {
    String firstName;
    String lastName;

    @Pattern(regexp = "\\d+")
    String contactNumber;
}
