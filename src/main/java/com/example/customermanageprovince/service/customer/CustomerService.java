package com.example.customermanageprovince.service.customer;

import com.example.customermanageprovince.model.Customer;
import com.example.customermanageprovince.model.Province;
import com.example.customermanageprovince.service.IGeneralService;

public interface CustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
