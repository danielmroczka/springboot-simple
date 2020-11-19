package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class MainController {

   @GetMapping
   public String helloWorld() {
       return "Hello World " + LocalDateTime.now();
   }
}
