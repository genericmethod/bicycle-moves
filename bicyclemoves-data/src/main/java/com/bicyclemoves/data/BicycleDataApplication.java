package com.bicyclemoves.data;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BicycleDataApplication {

  private static final Logger log = Logger.getLogger(BicycleDataApplication.class);

  public static void main(String[] args) throws Exception {
    log.info("**** Starting Bicycle Data Application");
    SpringApplication.run(BicycleDataApplication.class);
    log.info("**** Bicycle Data Application Started");
  }
}
