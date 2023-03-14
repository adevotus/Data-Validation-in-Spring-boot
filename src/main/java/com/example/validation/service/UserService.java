package com.example.validation.service;


import com.example.validation.dto.UserRequestDTO;
import com.example.validation.model.UserModel;
import com.example.validation.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public UserModel getUserByID(Integer id) {
        return userRepository.findById(id).get();
    }


    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel insertUser(UserRequestDTO userRequestDTO) {
        UserModel userModel = new UserModel();
        userModel.setName(userRequestDTO.getName());
        userModel.setAddress(userRequestDTO.getAddress());
        userModel.setEmail(userRequestDTO.getEmail());
        userModel.setSalary(userRequestDTO.getSalary());
        userRepository.save(userModel);
        return userModel;


    }
}
