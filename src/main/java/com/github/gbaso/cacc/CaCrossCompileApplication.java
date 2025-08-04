package com.github.gbaso.cacc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CaCrossCompileApplication {

  private static final Logger log = LoggerFactory.getLogger(CaCrossCompileApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(CaCrossCompileApplication.class, args);
  }

  @Bean
  ApplicationRunner hello() {
    return args -> log.info("Hello World!");
  }

}
