package ru.magnitom.parsefiles.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.magnitom.parsefiles.api.PaymentParseFile;


@Component
public class RunParseFiles implements CommandLineRunner {

    @Autowired
    PaymentParseFile paymentParseFile;

    @Override
    public void run(String... args) throws Exception {
        paymentParseFile.getFile();

    }
}
