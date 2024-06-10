package com.devTest.first_app.entities;

import com.devTest.first_app.enums.OperationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operations {
    @Id
    private Long id;
    @ManyToOne
    private BankAccount bankAccount;
    private OperationType type;
}
