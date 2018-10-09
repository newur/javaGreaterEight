package com.kn.middle;

import java.util.Optional;

import com.kn.bottom.external.api.CustomerService;
import com.kn.bottom.external.api.CustomerServiceImpl;
import com.kn.bottom.service.entity.Customer;

public class BusinessServiceImpl {

    private CustomerService customerService;

    public BusinessServiceImpl() {
        this.customerService = new CustomerServiceImpl();
    }

    public boolean isCustomerDieter() {

        Optional.of("foo")
                .isEmpty();

        Customer customer = customerService.findCustomer("abc");
        return customer.getName().equalsIgnoreCase("dieter");
    }
}
