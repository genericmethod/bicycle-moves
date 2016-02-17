package com.bicyclemoves.web;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BicycleMovesWebApplication {

    private static final Logger log = Logger.getLogger(BicycleMovesWebApplication.class);

    public static void main(String[] args){
        log.info("**** Starting Bicycle Web Application");
        SpringApplication.run(BicycleMovesWebApplication.class, args);
        log.info("**** Starting Bicycle Web Application Started");
    }
}
