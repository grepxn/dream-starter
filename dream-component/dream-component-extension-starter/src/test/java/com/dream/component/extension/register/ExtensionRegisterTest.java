package com.dream.component.extension.register;

import com.dream.component.extension.BizScenario;
import com.dream.component.extension.ExtensionExecutor;
import com.dream.component.extension.test.Application;

import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ExtensionRegisterTest {
    
    @Resource
    private ExtensionRegister register;

    @Resource
    private ExtensionExecutor executor;

    @Test
    public void test() {
        SomeExtPt extA = new SomeExtensionA();
        register.doRegistration(extA);

        SomeExtPt extB = CglibProxyFactory.createProxy(new SomeExtensionB());
        register.doRegistration(extB);
        
        executor.executeVoid(SomeExtPt.class, BizScenario.valueOf("A"), SomeExtPt::doSomeThing);
        executor.executeVoid(SomeExtPt.class, BizScenario.valueOf("B"), SomeExtPt::doSomeThing);
    }
    
}
