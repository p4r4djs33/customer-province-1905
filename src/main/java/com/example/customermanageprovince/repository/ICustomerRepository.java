package com.example.customermanageprovince.repository;

import com.example.customermanageprovince.model.Customer;
import com.example.customermanageprovince.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
