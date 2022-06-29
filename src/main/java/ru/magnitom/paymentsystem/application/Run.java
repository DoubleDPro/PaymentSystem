package ru.magnitom.paymentsystem.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import ru.magnitom.paymentsystem.api.scanfile.ScanPaymentDirectory;
import ru.magnitom.paymentsystem.implementation.ScanPaymentDirectoryImpl;

@Component
public class Run implements ApplicationRunner {


    private ScanPaymentDirectoryImpl scanPaymentDirectoryImpl;


//    @Override
//    public void run(String... args) throws Exception {
//
//        }
//    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("RRRRUUUNNNNEW!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println(scanPaymentDirectoryImpl.ScanDirectory());
        String[] arr = new AnnotationConfigApplicationContext().getBeanDefinitionNames();
        for (String i :
                arr) {
            System.out.println(i);
        }
    }
}