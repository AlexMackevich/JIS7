package com.example.bankapp.repository;

import com.example.bankapp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long> {

    Optional <UserEntity> findByLoginAndPassword(String login, String password);

    Optional <UserEntity> findFirstByLogin(String login);
}
