package com.dream.api;

import com.dream.component.dto.MultiResponse;
import com.dream.component.dto.Response;
import com.dream.dto.CustomerAddCmd;
import com.dream.dto.CustomerListByNameQry;
import com.dream.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
