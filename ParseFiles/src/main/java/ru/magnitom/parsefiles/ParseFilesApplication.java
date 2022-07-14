package ru.magnitom.parsefiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

@SpringBootApplication
public class ParseFilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParseFilesApplication.class, args);
    }
}