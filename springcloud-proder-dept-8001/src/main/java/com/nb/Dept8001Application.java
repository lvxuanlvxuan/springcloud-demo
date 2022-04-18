package com.nb;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/21 16:11
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@SpringBootApplication
@MapperScan("com.nb.mapper")
public class Dept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Dept8001Application.class,args);
        log.info("启动成功");
    }
}
