package dp.creational.simplefactory.chart;

import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 23:33:52
 * desc: xlm util clazz
 * <p>
 **/

@Slf4j
public class XMLUtils {

    public static String getChartType() {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("/Users/edward/IdeaProjects/design-pattern/src/main/java/design/pattern/creational/simplefactory/chart/config.xml"));

            String charType = document.getElementsByTagName("chartType").item(0).getFirstChild().getNodeValue();

            return charType;
        }
        catch (ParserConfigurationException | SAXException | IOException e) {
            log.error("XMLUtils::getCharType::exception:{ " + "" + "}", e);
        }

        return null;
    }
}
