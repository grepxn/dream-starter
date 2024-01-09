//package com.dream.customer.gatewayimpl;
//
//import com.dream.customer.database.mapper.CustomerMapper;
//import com.dream.customer.database.dataobject.CustomerDO;
//import com.dream.domain.customer.Customer;
//import com.dream.domain.customer.gateway.CustomerGateway;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CustomerGatewayImpl implements CustomerGateway {
//    @Autowired
//    private CustomerMapper customerMapper;
//
//    public Customer getByById(String customerId){
//      CustomerDO customerDO = customerMapper.getById(customerId);
//      //Convert to Customer
//      return null;
//    }
//}
