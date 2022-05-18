package com.akis_yazilim.oracle.melih.transaction.model.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

@SequenceGenerator(name = "TRANSACTION_ID_SEQUENCE", sequenceName = "TRANSACTION_ID_SEQ", initialValue = 1, allocationSize = 1)
@Data
@Table(name = "TRANSACTIONS")
@Entity
public class Transaction
{
    @NonNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRANSACTION_ID_SEQUENCE")
    @Column(name = "TRANSACTION_ID")
    @Id
    private Integer transactionID;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Integer productID;

    @Column(name = "USER_ID", nullable = false)
    private Integer userID;

    @Temporal(TemporalType.DATE)
    @Column(name = "TRANSACTION_TIME")
    private Date transactionTime;
}
