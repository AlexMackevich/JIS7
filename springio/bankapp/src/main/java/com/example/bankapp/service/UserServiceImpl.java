package com.example.bankapp.service;

import com.example.bankapp.entity.UserEntity;
import com.example.bankapp.exception.UserValidationException;
import com.example.bankapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(@Qualifier("users")UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity registerUser(String login, String password, String mail) {
        if (login == null || password == null) {
            throw new UserValidationException("Name or password can't be a null");
        } else {
            UserEntity userEntity = new UserEntity();
            userEntity.setLogin(login);
            userEntity.setPassword(password);
            userEntity.setMail(mail);
            return userRepository.save(userEntity);
        }
    }

    public UserEntity authenticationUser (String login, String password){
        return userRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}
