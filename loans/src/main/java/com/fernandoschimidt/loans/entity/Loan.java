package com.fernandoschimidt.loans.entity;

import com.fernandoschimidt.loans.enummarator.LoanType;
import lombok.Getter;

@Getter
public class Loan {
    private LoanType type;
    private Double interest_rate;

    public Loan(LoanType type) {
        this.type = type;
        switch (type) {
            case PERSONAL -> this.interest_rate = 4.00;
            case GUARANTEED -> this.interest_rate = 3.00;
            case CONSIGNMENT -> this.interest_rate = 2.00;
        }
    }
}
