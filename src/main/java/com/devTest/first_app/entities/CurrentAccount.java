package com.devTest.first_app.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue(value = "CR")
@Data @AllArgsConstructor @NoArgsConstructor
public class CurrentAccount extends BankAccount{
    private Double overDraft;
}



