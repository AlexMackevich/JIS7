package com.example.bankapp.service;

import com.example.bankapp.entity.CreditCardEntity;
import com.example.bankapp.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    private CreditCardRepository cardRepository;

    @Override
    public CreditCardEntity create(String cardNumber, String paymentSystem, String cardStatus, String cardType,
                                   String cardValidity, BigDecimal founds) {
        var creditCard = new CreditCardEntity();
        creditCard.setCardNumber(cardNumber);
        creditCard.setPaymentSystem(paymentSystem);
        creditCard.setCardStatus(cardStatus);
        creditCard.setCardType(cardType);
        creditCard.setCardValidity(cardValidity);
        creditCard.setFounds(founds);
        return cardRepository.save(creditCard);
    }
}
