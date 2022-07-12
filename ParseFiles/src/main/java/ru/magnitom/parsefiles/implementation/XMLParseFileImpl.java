package ru.magnitom.parsefiles.implementation;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.magnitom.parsefiles.api.PaymentParseFile;
import ru.magnitom.parsefiles.entity.ParseXmlPayment;
import ru.magnitom.parsefiles.repository.RepoParse;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class XMLParseFileImpl implements PaymentParseFile {

    @Autowired
    RepoParse repoParse;

    @Override
    public void getFile() throws FileNotFoundException, XMLStreamException {
//        String inputFile = "D:\\IT\\project idea\\PaymentSystem\\payment.xml"; //for Windows path
        String inputFile = "/home/pavel/temp/file/payment.xml";
        XMLInputFactory f = XMLInputFactory.newFactory();
        XMLStreamReader sr = f.createXMLStreamReader(new FileInputStream(inputFile));
//        List<String> listPayment = new ArrayList<>();
        String[] arrPaymentXml = new String[3];
        sr.next();
        boolean fromDone = false, toDone = false, amountDone = false;
        if (sr.isStartElement() && sr.getLocalName().equals("Payment")) {
            sr.next();
            while (sr.hasNext() || sr.getEventType() != 8) {
                if (sr.isStartElement()) {
                    switch (sr.getLocalName()) {
                        case "From": {
                            sr.next();
                            arrPaymentXml[0] = sr.getText();
                            fromDone = true;
                            break;
                        }
                        case "To": {
                            sr.next();
                            arrPaymentXml[1] = sr.getText();
                            toDone = true;
                            break;
                        }
                        case "Amount": {
                            sr.next();
                            arrPaymentXml[2] = sr.getText();
                            amountDone = true;
                            break;
                        }
                        default:
                            break;
                    }
                } else {
                    sr.next();
                }
            }
        }
        sr.close();
        if (fromDone && toDone && amountDone) {
            repoParse.save(new ParseXmlPayment(arrPaymentXml[0], arrPaymentXml[1], Integer.parseInt(arrPaymentXml[2])));
        }
    }

    @Override
    public Map<String, String> parseFile(File file) {
        return null;
    }
}
