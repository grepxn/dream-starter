package com.dream.component.extension.test.customer.app.extensionpoint;

import com.dream.component.extension.ExtensionPointI;
import com.dream.component.extension.test.customer.client.AddCustomerCmd;
import com.dream.component.extension.test.customer.domain.CustomerEntity;

/**
 * CustomerConvertorExtPt
 *
 * @author Frank Zhang
 * @date 2018-01-07 2:37 AM
 */
public interface CustomerConvertorExtPt extends ExtensionPointI {

    public CustomerEntity clientToEntity(AddCustomerCmd addCustomerCmd);
}
