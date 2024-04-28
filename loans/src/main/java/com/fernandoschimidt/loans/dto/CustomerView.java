package com.fernandoschimidt.loans.dto;

import com.fernandoschimidt.loans.entity.Loan;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CustomerView{
    private String customer;
    private List<Loan> loans;
}
