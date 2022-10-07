package com.chiromo.chiromocabs.order;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
