package com.dream.component.extension.register;

import com.dream.component.extension.Extension;

import org.springframework.stereotype.Component;

@Extension(bizId = "A")
@Component
public class SomeExtensionA implements SomeExtPt {

    @Override
    public void doSomeThing() {
        System.out.println("SomeExtensionA::doSomething");
    }

}