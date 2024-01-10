package com.dream.system.infrastructure.rbac.mapper;

import com.dream.system.infrastructure.rbac.dataobject.UserDO;
import com.dream.system.infrastructure.rbac.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: 西南
 * @Date: 2024/1/10
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() {
        List<UserDO> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
