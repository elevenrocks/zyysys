package org.lanqiao.zyysys;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.zyysys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZyysysApplication.class)
public class TestUser {
    @Autowired
    private UserService userService;
    @Test
    public void TestUserServiceImpl(){
        log.info("开始-----------------");
        System.out.println(UUID.randomUUID());
//        System.out.println(userService.selectByPrimaryKey(1));
        log.info("结束-----------------");
    }
}
