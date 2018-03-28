package dp.creational.factorymethod.log;

import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 21:24:58
 * desc: 解析 xml 工具类
 * <p>
 **/

@Slf4j
public class XMLUtils {

    public static Object getBean() {

        File file = new File(
            "/Users/edward/IdeaProjects/design-pattern/src/main/java/design/pattern/creational/factorymethod/log"
            + "/hidefactorymethod/config.xml");

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
