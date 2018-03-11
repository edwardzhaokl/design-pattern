package design.pattern.creational.factorymethod.log.hidefactorymethod;

import design.pattern.creational.factorymethod.log.DatabaseLoggerFactory;
import design.pattern.creational.factorymethod.log.XMLUtils;
import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 21:20:55
 * desc:
 * <p>
 **/

public class Client {


    @Test
    public void test() {

        LoggerFactory factory = (LoggerFactory) XMLUtils.getBean();

        factory.writeLog();
    }
}
