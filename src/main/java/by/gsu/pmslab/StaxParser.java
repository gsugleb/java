package by.gsu.pmslab;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxParser {
    public static void main(String[] args) {
        boolean bNumCode = false;
        boolean bCharCode = false;
        boolean bNominal = false;
        boolean bName = false;
        boolean bValue = false;

        try {
            String url="http://www.cbr.ru/scripts/XML_daily.asp";
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = factory.createXMLEventReader(new URL(url).openStream());

            while(eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                switch(event.getEventType()) {

                    case XMLStreamConstants.START_ELEMENT:
                        StartElement startElement = event.asStartElement();
                        String qName = startElement.getName().getLocalPart();

                        if (qName.equalsIgnoreCase("Valute")) {
                            System.out.println("Start Element : Valute");
                            Iterator<Attribute> attributes = startElement.getAttributes();
                            String ID = attributes.next().getValue();
                            System.out.println("ID : " + ID);
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
                        break;

                    case XMLStreamConstants.CHARACTERS:
                        Characters characters = event.asCharacters();
                        if(bNumCode) {
                            System.out.println("NumCode: " + characters.getData());
                            bNumCode = false;
                        }
                        if(bCharCode) {
                            System.out.println("CharCode: " + characters.getData());
                            bCharCode = false;
                        }
                        if(bNominal) {
                            System.out.println("Nominal: " + characters.getData());
                            bNominal = false;
                        }
                        if(bName) {
                            System.out.println("Name: " + characters.getData());
                            bName = false;
                        }
                        if(bValue) {
                            System.out.println("Value: " + characters.getData());
                            bValue = false;
                        }
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        EndElement endElement = event.asEndElement();

                        if(endElement.getName().getLocalPart().equalsIgnoreCase("Valute")) {
                            System.out.println("----------------------------");
                        }
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

