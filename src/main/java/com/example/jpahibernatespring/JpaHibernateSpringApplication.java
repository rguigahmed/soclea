package com.example.jpahibernatespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EntityScan("com.example.jpahibernatespring.Candidat")
@SpringBootApplication
@Configuration
@ComponentScan("com.example.jpahibernatespring.Candidat")
 public class JpaHibernateSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateSpringApplication.class, args);
    }

}
