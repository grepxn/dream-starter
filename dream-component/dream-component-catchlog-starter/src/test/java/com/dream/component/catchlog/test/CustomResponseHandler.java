package com.dream.component.catchlog.test;

import com.dream.component.catchlog.ResponseHandlerI;
import org.springframework.stereotype.Component;

@Component
public class CustomResponseHandler implements ResponseHandlerI {

    @Override
    public Object handle(Class returnType, String errCode, String errMsg) {
        System.out.println("==== This is Customized Response handler");
        Demo.DemoResponse response = new Demo.DemoResponse();
        response.setSuccess(false);
        return response;
    }
}
