package com.example.demo.service;

import com.example.demo.User.Dto.UserRegisterDTO;
import com.example.demo.model.User;

public interface UserService {
    public User save(UserRegisterDTO registerDTO);
}
