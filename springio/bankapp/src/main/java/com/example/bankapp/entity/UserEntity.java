package com.example.bankapp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "client")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "username")
    private String userName;
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;
    private String mail;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "card_id")
    private Collection<CreditCardEntity> creditCard;

    public UserEntity(String firstName, String lastName, String userName, String password, String phoneNumber, String mail, Collection<CreditCardEntity> creditCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.creditCard = creditCard;
    }
}