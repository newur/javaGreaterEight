package com.kn.bottom.external.api;

import com.kn.bottom.external.api.CustomerService;
import com.kn.bottom.service.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer findCustomer(String id) {
        return new Customer("Dieter", 42);
    }
}
