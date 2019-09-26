package com.example.jain.code.service;

import com.example.jain.code.model.User;
import com.example.jain.code.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public void createUser(User user) {

        userRepository.save(user);
    }


}
