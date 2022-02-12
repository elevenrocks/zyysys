package org.lanqiao.zyysys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.lanqiao.zyysys.dao")
public class ZyysysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZyysysApplication.class, args);
    }

}
