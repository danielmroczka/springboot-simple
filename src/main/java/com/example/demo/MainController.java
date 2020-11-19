package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("/api")
public class MainController {

   @GetMapping
   public String helloWorld() {
       return "Hello World " + ZonedDateTime.now();
   }
}
