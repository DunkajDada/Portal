package com.record.portal.Service.Impl;

import com.record.portal.DTO.UserDTO;
import com.record.portal.Entity.User;
import com.record.portal.Mapper.UserMapper;
import com.record.portal.Repository.UserRepository;
import com.record.portal.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public User addUser(UserDTO userDTO) {
        User user = userMapper.maptoUser(userDTO);
        userRepository.save(user);

        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(int userID) {
        return userRepository.findById(userID);
    }

    @Override
    public User updateUser(int userID, UserDTO userDTO) {
        User existingUser = userRepository.findById(userID).orElse(null);
        if (existingUser == null) {
            return null;
        }
        userMapper.updateExistingUser(existingUser, userDTO);

        return userRepository.save(existingUser);
    }
}
