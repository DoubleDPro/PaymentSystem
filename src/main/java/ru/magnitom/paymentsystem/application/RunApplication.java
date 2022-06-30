package ru.magnitom.paymentsystem.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.magnitom.paymentsystem.api.scanfile.ScanPaymentDirectory;

@Component
public class RunApplication implements CommandLineRunner{

    @Autowired
    ScanPaymentDirectory scanPaymentDirectory;

    @Override
    public void run(String... args){
        scanPaymentDirectory.ScanDirectory();
    }
}