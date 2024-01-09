package com.dream.component.extension.test.customer.app;

import com.dream.component.dto.Response;
import com.dream.component.dto.SingleResponse;
import com.dream.component.extension.test.customer.client.AddCustomerCmd;
import com.dream.component.extension.test.customer.client.CustomerDTO;
import com.dream.component.extension.test.customer.client.CustomerServiceI;
import com.dream.component.extension.test.customer.client.GetOneCustomerQry;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 *
 * @author Frank Zhang 2018-01-06 7:40 PM
 */
@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private AddCustomerCmdExe addCustomerCmdExe;

    @Resource
    private GetOneCustomerQryExe getOneCustomerQryExe;


    @Override
    public Response addCustomer(AddCustomerCmd addCustomerCmd) {
        return addCustomerCmdExe.execute(addCustomerCmd);
    }

    @Override
    public SingleResponse<CustomerDTO> getCustomer(GetOneCustomerQry getOneCustomerQry) {
        return getOneCustomerQryExe.execute(getOneCustomerQry);
    }
}
