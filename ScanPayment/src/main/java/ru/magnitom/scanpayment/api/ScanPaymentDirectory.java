package ru.magnitom.scanpayment.api;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public interface ScanPaymentDirectory {

    String tempDirectory = "C:\\Temp";
    String paymentDirectory = "C:\\Temp\\PaymentDirectory";

    List<File> scanDirectory() throws IOException;

    List<File> fileIsCorrect(List<File> listScanFile) throws IOException;

    List<File> removeAndPullFile(List<File> listScanFile) throws IOException;

}
