package com.kn.top;

import com.kn.bottom.service.entity.Customer;
import com.kn.middle.BusinessServiceImpl;

public class UiService {

    private BusinessServiceImpl businessService;

    public UiService() {
        this.businessService = new BusinessServiceImpl();
    }

    public String isDieterJson() {
        boolean customerDieter = businessService.isCustomerDieter();

        return "{ isDieter : " + customerDieter + " }";
    }

    public Customer getCustomer() {
        return new Customer("Heinz", 43);
    }
}
