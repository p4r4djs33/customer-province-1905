package com.example.customermanageprovince.service.customer;

import com.example.customermanageprovince.model.Customer;
import com.example.customermanageprovince.model.Province;
import com.example.customermanageprovince.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
