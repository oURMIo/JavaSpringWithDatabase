package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String args[]) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.run();
    }

    @Autowired
    private DoWithDB doWithDB;

    @Override
    public void run(String... args) throws Exception {

        System.out.printf("%n ///// PRINT ///// %n");
        System.out.println(doWithDB.findAll());

    }
}

