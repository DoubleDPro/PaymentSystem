package ru.magnitom.scanpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;


@SpringBootApplication
//@EntityScan("ru.magnitom.scanpayment.entity")
//@EnableJpaRepositories("ru.magnitom.scanpayment.repository")
//@ComponentScan("ru.magnitom.scanpayment")
public class ScanPayment {

    public static void main(String[] args) {
        SpringApplication.run(ScanPayment.class, args);
    }
}