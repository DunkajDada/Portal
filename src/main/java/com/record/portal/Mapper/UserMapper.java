package com.record.portal.Mapper;

import com.record.portal.DTO.UserDTO;
import com.record.portal.Entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User maptoUser(UserDTO userDTO){
        User user = new User();

        user.setName(userDTO.getName());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setEmail(userDTO.getEmail());
        user.setDateOfBirth(userDTO.getDateOfBirth());

        return user;
    }

    public User updateExistingUser(User existingUser, UserDTO userDTO) {
        existingUser.setName(userDTO.getName());
        existingUser.setPhoneNumber(userDTO.getPhoneNumber());
        existingUser.setEmail(userDTO.getEmail());
        existingUser.setDateOfBirth(userDTO.getDateOfBirth());
        return existingUser;
    }
}
