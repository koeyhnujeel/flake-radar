package com.zoonza.flakerader;

import org.springframework.boot.SpringApplication;

public class TestFlakeRaderApplication {

    public static void main(String[] args) {
        SpringApplication.from(FlakeRaderApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
