package com.dream.component.extension.test.customer.domain.rule;

import com.dream.component.extension.ExtensionPointI;
import com.dream.component.extension.test.customer.domain.CustomerEntity;

/**
 * CustomerRuleExtPt
 *
 * @author Frank Zhang
 * @date 2018-01-07 12:03 PM
 */
public interface CustomerRuleExtPt extends ExtensionPointI {

    //Different business check for different biz
    public boolean addCustomerCheck(CustomerEntity customerEntity);

    //Different upgrade policy for different biz
    default public void customerUpgradePolicy(CustomerEntity customerEntity){
        //Nothing special
    }
}
