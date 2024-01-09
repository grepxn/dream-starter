package com.dream.component.domain.customer.gateway;

import com.dream.component.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
