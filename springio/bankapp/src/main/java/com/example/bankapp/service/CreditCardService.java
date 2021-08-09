package com.example.bankapp.service;

import com.example.bankapp.entity.CreditCardEntity;

import java.math.BigDecimal;

public interface CreditCardService {

    CreditCardEntity create (String cardNumber, String paymentSystem,
                             String cardStatus, String cardType, String cardValidity,
                             BigDecimal founds);

}