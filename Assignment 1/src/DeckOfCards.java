import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class DeckOfCards {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        File file = new File("cards\\MstCards_151021.xml");
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(file);

        doc.getDocumentElement().normalize();


    }
}