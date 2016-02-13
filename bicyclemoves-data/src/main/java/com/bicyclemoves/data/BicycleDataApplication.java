package com.bicyclemoves.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BicycleDataApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(BicycleDataApplication.class);
  }
}
