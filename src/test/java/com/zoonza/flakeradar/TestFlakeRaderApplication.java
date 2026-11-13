package com.zoonza.flakeradar;

import org.springframework.boot.SpringApplication;

public class TestFlakeRaderApplication {

    public static void main(String[] args) {
        SpringApplication.from(FlakeRadarApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
