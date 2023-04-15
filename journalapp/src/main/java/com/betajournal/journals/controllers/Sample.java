package com.betajournal.journals.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.betajournal.journals.domain.Test;
import com.betajournal.journals.repositories.TestRepository;


@RestController
public class Sample 
{
  TestRepository newRepo;
  
  public Sample(TestRepository newRepo) {
    this.newRepo = newRepo;
  }
  @PostMapping("/saveUser")
  public Test save(@RequestBody Test newTest)
  {
    newRepo.save(newTest);
    return newTest;
  }
  @GetMapping("/showAll")
  public List<Test> showAllUsers()
  {
    return newRepo.findAll();
  }
  @GetMapping("/hello")
  public String helloWorld(@RequestParam String name)
  {
    return "Hello " + name;
  }
}
