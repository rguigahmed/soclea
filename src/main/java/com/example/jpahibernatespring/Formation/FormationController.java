package com.example.jpahibernatespring.Formation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiformation")
@Configuration
@ComponentScan(value = "com.example.jpahibernatespring.Formation")
public class FormationController {

}
