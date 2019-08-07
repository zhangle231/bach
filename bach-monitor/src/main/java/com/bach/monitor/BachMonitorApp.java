package com.bach.monitor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.bach.monitor.mapper"})
public class BachMonitorApp {
    public static void main(String[] args) {
        SpringApplication.run(BachMonitorApp.class, args);
    }
}
