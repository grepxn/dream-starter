package com.dream.customer;

import com.dream.api.CustomerServiceI;
import com.dream.component.catchlog.CatchAndLog;
import com.dream.component.dto.MultiResponse;
import com.dream.component.dto.Response;
import com.dream.dto.CustomerAddCmd;
import com.dream.dto.CustomerListByNameQry;
import com.dream.dto.data.CustomerDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import com.dream.customer.executor.CustomerAddCmdExe;
import com.dream.customer.executor.query.CustomerListByNameQryExe;


@Service
@CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}