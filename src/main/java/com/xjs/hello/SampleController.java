package com.xjs.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleController {

  @RequestMapping("/")
  String home() {
    return "Hello World!";
  }

  @RequestMapping("/hello")
  String home1() {
    return "Hello World!";
  }

  public static void main(final String[] args) throws Exception {
    SpringApplication.run(SampleController.class, args);
  }
}