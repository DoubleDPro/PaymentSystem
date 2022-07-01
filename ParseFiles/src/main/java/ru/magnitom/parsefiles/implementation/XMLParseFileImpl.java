package ru.magnitom.parsefiles.implementation;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Component;
import ru.magnitom.parsefiles.api.PaymentParseFile;

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


    @Override
    public void getFile() throws FileNotFoundException, XMLStreamException {
        String inputFile = "D:\\IT\\project idea\\PaymentSystem\\payment.xml";
        XMLInputFactory f = XMLInputFactory.newFactory();
        XMLStreamReader sr = f.createXMLStreamReader(new FileInputStream(inputFile));
        List<String> listPayment = new ArrayList<>();
        sr.next();
        while (sr.hasNext() || sr.getEventType() != 8) {
            if (sr.hasText() && !sr.isWhiteSpace()) {
                    listPayment.add(sr.getText());
            }
            sr.next();
        }
        sr.close();
    }

    @Override
    public Map<String, String> parseFile(File file) {
        return null;
    }
}
