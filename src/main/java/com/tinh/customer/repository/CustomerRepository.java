package com.tinh.customer.repository;

import com.tinh.customer.model.Customer;
import com.tinh.customer.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Iterable<Customer>findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);
}
