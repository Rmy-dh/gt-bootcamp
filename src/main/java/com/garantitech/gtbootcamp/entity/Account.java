package com.garantitech.gtbootcamp.entity;

import com.garantitech.gtbootcamp.enums.AccountType;
import com.garantitech.gtbootcamp.enums.PriceType;
import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ACCOUNT")
public class Account {

    @Id
    @Generated
    private Long id;

    @Column(name="CustomerId",length = 10,nullable = false)
    private Long customerId;

    @Column(name="ibanNo",length = 10,nullable = false)
    private Long ibanNo;


    @Column(name="currentBalance",length = 10,nullable = false)
    private double currentBalance;

    @Column(name="Account")
    public AccountType accaountType;           //enum

    @Column(name = "PriceType")               //enum
    public PriceType priceType;


}
