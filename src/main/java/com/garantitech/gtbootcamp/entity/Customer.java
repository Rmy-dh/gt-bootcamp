package com.garantitech.gtbootcamp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="CUSTOMER")
public class Customer {

    @Id
    @Generated
    private Long id;

    @Column(name="name",length = 10,nullable = false)
    private  String name;

    @Column(name="surname",length = 20,nullable = false)
    private String surname;

    @Column(name="identityNo",length = 5,nullable = false)
    private Long identityNo;

    @Column(name="password",length = 10,nullable = false)
    private String password;

    @Column(name="email",length = 30,nullable = false)
    private String email;

    @Column(name="phoneNumber",length = 10,nullable = false)
    private long phoneNumber;





}
