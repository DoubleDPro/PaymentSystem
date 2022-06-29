package ru.magnitom.paymentsystem.implementation;

import org.springframework.stereotype.Component;
import ru.magnitom.paymentsystem.api.scanfile.ScanPaymentDirectory;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ScanPaymentDirectoryImpl implements ScanPaymentDirectory {

    @Override
    public File ScanDirectory() {
        File folder = new File(tempDrectory);
        File[] arrFiles = folder.listFiles();
        assert arrFiles != null;
        List<File> listScanFile = new ArrayList<>(Arrays.asList(arrFiles));
        listScanFile.removeIf(file -> !file.isFile());
        return FileIsCorrect(listScanFile);
    }

    @Override
    public File FileIsCorrect(List<File> listScanFile) {
        File file = null;
        for (File i : listScanFile) {
            String nameFile = i.getName();
            if (nameFile.endsWith(".txt") || nameFile.endsWith(".json") || nameFile.endsWith(".xml")) {
                System.out.println(i);
                file = i;
                break;
            }
        }
        if (file == null) {
            ScanDirectory();
        }
        return file;
    }
}
