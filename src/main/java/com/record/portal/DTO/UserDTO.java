package com.record.portal.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserDTO {

        private String name;
        private String phoneNumber;
        private String email;
        private LocalDate dateOfBirth;

}
