package ru.magnitom.parsefiles.api;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public interface PaymentParseFile {


    void getFile() throws FileNotFoundException, XMLStreamException;

    Map<String, String> parseFile(File file);


}
