package com.tinh.customer;

import com.tinh.customer.service.CustomerService;
import com.tinh.customer.service.ProvinceService;
import com.tinh.customer.service.impl.CustomerServiceImpl;
import com.tinh.customer.service.impl.ProvinceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Bean
	public CustomerService customerService(){
		return new CustomerServiceImpl();
	}

	@Bean
	public ProvinceService provinceService(){
		return new ProvinceServiceImpl();
	}

}
