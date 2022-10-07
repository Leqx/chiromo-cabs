package com.chiromo.chiromocabs.payment;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
