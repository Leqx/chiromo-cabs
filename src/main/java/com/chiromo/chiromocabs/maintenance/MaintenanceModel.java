package com.chiromo.chiromocabs.maintenance;

import javax.persistence.*;

@Entity
@Table(name = "maintenance")
public class MaintenanceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
