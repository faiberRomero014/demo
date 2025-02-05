package com.example.demo.service.impl;

import com.example.demo.User.Dto.UserRegisterDTO;
import com.example.demo.model.Rol;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
        private UserRepo userRepo;



    @Override
    public User save(UserRegisterDTO registerDTO) {
        User user=new User(registerDTO.getName(), registerDTO.getLastname(),
                registerDTO.getEmail(), registerDTO.getPassword(),
                Arrays.asList(new Rol("user")));
        return userRepo.save(user);
    }
}
