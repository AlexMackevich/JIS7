package com.example.bankapp.service;

import com.example.bankapp.entity.UserEntity;

public interface UserService {

    UserEntity registerUser(String login, String password, String mail);
    UserEntity findById ();
    UserEntity update (String firstName, String lastName, String phoneNumber);
    UserEntity delete ();

}
