package com.example.bankapp.service;

import com.example.bankapp.entity.UserEntity;
import com.example.bankapp.exception.UserValidationException;
import com.example.bankapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity registerUser(String login, String password, String mail) {
        if (login == null || password == null) {
            throw new UserValidationException("Name or password can't be a null");
        } else {
            if (userRepository.findFirstByLogin(login).isPresent()){
                System.out.println("Duplicate login");
                return null;
            }
            UserEntity userEntity = new UserEntity();
            userEntity.setLogin(login);
            userEntity.setPassword(password);
            userEntity.setMail(mail);
            return userRepository.save(userEntity);
        }
    }

    @Override
    public UserEntity findById() {
        return null;
    }

    @Override
    public UserEntity update ( String firstName, String lastName, String phoneNumber) {
        if (firstName == null || lastName == null || phoneNumber == null) {
            throw new UserValidationException("Name or password can't be a null");
        } else {
            UserEntity userEntity = new UserEntity();
            userEntity.setFirstName(firstName);
            userEntity.setLastName(lastName);
            userEntity.setPhoneNumber(phoneNumber);
            return userRepository.save(userEntity);
        }
    }

    @Override
    public UserEntity delete() {
        return null;
    }

    public UserEntity authenticationUser(String login, String password) {
        return userRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}
