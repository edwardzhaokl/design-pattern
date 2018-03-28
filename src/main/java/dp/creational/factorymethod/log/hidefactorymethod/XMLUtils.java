package dp.creational.factorymethod.log.hidefactorymethod;

import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 23:08:14
 * desc:
 * <p>
 **/

@Slf4j
public class XMLUtils {

    public static Object getBean() {

        File file = new File(
            "/Users/edward/IdeaProjects/design-pattern/src/main/java/design/pattern/creational/factorymethod/log/config.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(file);

            NodeList nodeList = document.getElementsByTagName("className");

            String className = nodeList.item(0).getFirstChild().getNodeValue();
            log.info("className: {}", className);

            Class clazz = Class.forName(className);

            return clazz.newInstance();

        } catch (Exception e) {
            log.error("error: ", e);
        }

        return null;
    }
}
