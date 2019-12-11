package by.gsu.pmslab;

import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


public class DomParser {
    public static void main(String[] args) {
        try {
            String url="http://www.cbr.ru/scripts/XML_daily.asp";
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new URL(url).openStream());
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Valute");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : " + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Valute ID : "
                            + eElement.getAttribute("ID"));
                    System.out.println("NumCode : "
                            + eElement
                            .getElementsByTagName("NumCode")
                            .item(0)
                            .getTextContent());
                    System.out.println("CharCode : "
                            + eElement
                            .getElementsByTagName("CharCode")
                            .item(0)
                            .getTextContent());
                    System.out.println("Nominal : "
                            + eElement
                            .getElementsByTagName("Nominal")
                            .item(0)
                            .getTextContent());
                    System.out.println("Name : "
                            + eElement
                            .getElementsByTagName("Name")
                            .item(0)
                            .getTextContent());
                    System.out.println("Value : "
                            + eElement
                            .getElementsByTagName("Value")
                            .item(0)
                            .getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
