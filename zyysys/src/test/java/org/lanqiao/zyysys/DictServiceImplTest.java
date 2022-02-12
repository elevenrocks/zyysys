package org.lanqiao.zyysys;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.zyysys.domain.Dict;
import org.lanqiao.zyysys.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZyysysApplication.class)
public class DictServiceImplTest {
    @Autowired
    private DictService service;

    @Test
    public void testSelectByPrimaryKey(){
        log.info("------执行-----------");
        Dict dict = service.selectByPrimaryKey(1);

        System.out.println(dict);
        log.info("----------查询完毕-------------");

    }
}
