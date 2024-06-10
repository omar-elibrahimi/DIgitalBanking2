package com.devTest.first_app.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@DiscriminatorValue(value = "SA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SavingAccount extends BankAccount{
    private Double interest;
}
