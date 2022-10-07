package com.chiromo.chiromocabs.customer;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class CustomerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

}
