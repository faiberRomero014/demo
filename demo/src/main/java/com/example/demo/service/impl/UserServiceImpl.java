package com.example.demo.service.impl;

import com.example.demo.User.Dto.UserRegisterDTO;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

        private UserRepo userRepo;

        public UserServiceImpl(UserRepo userRepo){
            super();
            this.userRepo=userRepo;
        }


    @Override
    public User save(UserRegisterDTO registerDTO) {
        return null;
    }
}
