package com.chiromo.chiromocabs.vehicle;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
public class VehicleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
