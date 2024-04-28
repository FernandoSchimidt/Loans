package com.fernandoschimidt.loans.controller;

import com.fernandoschimidt.loans.dto.CustomerDto;
import com.fernandoschimidt.loans.dto.CustomerView;
import com.fernandoschimidt.loans.entity.Customer;
import com.fernandoschimidt.loans.entity.Loan;
import com.fernandoschimidt.loans.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer-loans")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerView> getCustomerLoans(
            @RequestBody CustomerDto customerDto
    ) {
        Customer customer = customerDto.toCustomer();
        List<Loan> loans = customerService.getLoans(customer);
        return ResponseEntity.status(HttpStatus.OK)
                .body(new CustomerView(customer.name(), loans));
    }

}
