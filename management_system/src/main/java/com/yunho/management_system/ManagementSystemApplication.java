package com.yunho.management_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementSystemApplication.class, args);
    }

}
