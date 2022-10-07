package com.chiromo.chiromocabs.employee;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
