package com.fernandoschimidt.loans;

import com.fernandoschimidt.loans.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustormeRepository extends JpaRepository<Customer, Long> {
}
