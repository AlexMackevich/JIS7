package com.example.bankapp.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "credit_card")
public class CreditCardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "payment_system")
    private String paymentSystem;

    @Column(name = "card_status")
    private String cardStatus;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "card_validity")
    private String cardValidity;

    private BigDecimal founds;

    public CreditCardEntity(String cardNumber, String paymentSystem, String cardStatus, String cardType, String cardValidity, BigDecimal founds) {
        this.cardNumber = cardNumber;
        this.paymentSystem = paymentSystem;
        this.cardStatus = cardStatus;
        this.cardType = cardType;
        this.cardValidity = cardValidity;
        this.founds = founds;
    }

    private enum paymentSystem{
        VISA,
        MASTERCARD
    }

    private enum cardStatus{
        CLASSIC,
        GOLD,
        PLATINUM,
        INFINITY
    }

    private enum cardType {
        DEBIT,
        CREDIT,
        OVERDRAFT
    }
}