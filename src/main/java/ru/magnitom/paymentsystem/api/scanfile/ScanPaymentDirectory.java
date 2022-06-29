package ru.magnitom.paymentsystem.api.scanfile;

import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
public interface ScanPaymentDirectory {

    String tempDrectory = "C:\\Temp";
//    String executableDirectory = "C:\\Temp\\executableDirectory";

    File ScanDirectory();

    File FileIsCorrect(List<File> listScanFile);

}
