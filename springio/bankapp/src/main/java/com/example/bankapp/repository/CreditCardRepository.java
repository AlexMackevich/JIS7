package com.example.bankapp.repository;

import com.example.bankapp.entity.CreditCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository <CreditCardEntity,Long> {
}
