package by.gsu.pmslab;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParser {
    public static void main(String[] args) {

        try {
            String url="http://www.cbr.ru/scripts/XML_daily.asp";
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler userhandler = new UserHandler();
            saxParser.parse(url, userhandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class UserHandler extends DefaultHandler {

    boolean bNumCode = false;
    boolean bCharCode = false;
    boolean bNominal = false;
    boolean bName = false;
    boolean bValue = false;


    @Override
    public void startElement(
            String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equalsIgnoreCase("Valute")) {
            String rollNo = attributes.getValue("ID");
            System.out.println("ID : " + rollNo);
        } else if (qName.equalsIgnoreCase("NumCode")) {
            bNumCode = true;
        } else if (qName.equalsIgnoreCase("CharCode")) {
            bCharCode = true;
        } else if (qName.equalsIgnoreCase("Nominal")) {
            bNominal = true;
        } else if (qName.equalsIgnoreCase("Name")) {
            bName = true;
        } else if (qName.equalsIgnoreCase("Value")) {
            bValue = true;
        }
    }

    @Override
    public void endElement(String uri,
                           String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Valute")) {
            System.out.println("----------------------------");
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (bNumCode) {
            System.out.println("NumCode: " + new String(ch, start, length));
            bNumCode = false;
        } else if (bCharCode) {
            System.out.println("CharCode: " + new String(ch, start, length));
            bCharCode = false;
        } else if (bNominal) {
            System.out.println("Nominal: " + new String(ch, start, length));
            bNominal = false;
        } else if (bName) {
            System.out.println("Name: " + new String(ch, start, length));
            bName = false;
        } else if (bValue) {
            System.out.println("Value: " + new String(ch, start, length));
            bValue = false;
        }
    }
}
