package com.devTest.first_app.entities;

import java.util.List;
import java.util.Date;

import com.devTest.first_app.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "TYPE", length = 4, discriminatorType = DiscriminatorType.STRING)

@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccount {
    @Id
    private Long id;
    private String balance;
    private Date CreatedAt;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "bankAccount")
    private List<Operations> operationList;
    private AccountStatus status;

}
