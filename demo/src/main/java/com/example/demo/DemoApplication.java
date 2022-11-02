package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private User user;

    public static void main(String args[]) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.run();
    }

    @Autowired
    private DoWithDB doWithDB;

    @Override
    public void run(String... args) throws Exception {
        Iterable<User> users = doWithDB.findAll();

        System.out.printf("%n ///// PRINT ///// %n");

    }
}

