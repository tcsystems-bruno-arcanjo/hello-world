package br.com.barcanjo.example.helloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping
  public ResponseEntity<?> sayHello() {
    return ResponseEntity.ok("Hello world!");
  }
}
