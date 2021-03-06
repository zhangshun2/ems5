package com.baizhi.ems;

import com.baizhi.ems.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ems5ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        System.out.println(userMapper.selectByPrimaryKey(1));
    }

}
