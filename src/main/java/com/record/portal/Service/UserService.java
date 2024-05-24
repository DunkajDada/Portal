package com.record.portal.Service;

import com.record.portal.DTO.UserDTO;
import com.record.portal.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User addUser(UserDTO userDTO);

    List<User> getAllUsers();

    Optional<User> getUser(int userID);

    User updateUser(int userID,UserDTO userDTO);
}
