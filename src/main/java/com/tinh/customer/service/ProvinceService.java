package com.tinh.customer.service;

import com.tinh.customer.model.Province;
import org.springframework.beans.factory.annotation.Autowired;

public interface ProvinceService {

    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
