package com.tinh.customer.service;

import com.tinh.customer.model.Customer;
import com.tinh.customer.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer>findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstName,Pageable pageable);
}
