package com.dream.component.extension.test.customer.app.extension;

import com.dream.component.domain.ApplicationContextHelper;
import com.dream.component.extension.test.customer.client.AddCustomerCmd;
import com.dream.component.extension.test.customer.client.CustomerDTO;
import com.dream.component.extension.test.customer.domain.CustomerEntity;
import org.springframework.stereotype.Component;

/**
 * CustomerConvertor
 *
 * @author Frank Zhang
 * @date 2018-01-07 3:08 AM
 */
@Component
public class CustomerConvertor{

    public CustomerEntity clientToEntity(Object clientObject){
        AddCustomerCmd addCustomerCmd = (AddCustomerCmd)clientObject;
        CustomerDTO customerDTO =addCustomerCmd.getCustomerDTO();
        CustomerEntity customerEntity = (CustomerEntity) ApplicationContextHelper.getBean(CustomerEntity.class);
        customerEntity.setCompanyName(customerDTO.getCompanyName());
        customerEntity.setCustomerType(customerDTO.getCustomerType());
        customerEntity.setBizScenario(addCustomerCmd.getBizScenario());
        return customerEntity;
    }
}
