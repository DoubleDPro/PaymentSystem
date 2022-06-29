package ru.magnitom.paymentsystem.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.magnitom.paymentsystem.api.scanfile.ScanPaymentDirectory;
import ru.magnitom.paymentsystem.implementation.ScanPaymentDirectoryImpl;

@SpringBootApplication
public class PaymentSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentSystemApplication.class, args);
//        String[] str = ctx.getBeanDefinitionNames();
//        for (String i :
//                str) {
//            System.out.println(i);
//        }
//

//        ScanPaymentDirectory scanPaymentDirectory = SpringApplication.getBean(ScanPaymentDirectoryImpl.class);
//        scanPaymentDirectory.ScanDirectory();
    }

//    @Bean
//    public void CommandLineRunnerBean() {
//
//    }
}