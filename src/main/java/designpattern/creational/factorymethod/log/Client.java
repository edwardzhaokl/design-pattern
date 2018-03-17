package designpattern.creational.factorymethod.log;

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
    public void test1() {
        // 配置文件实现
        LoggerFactory factory = new DatabaseLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }

    @Test
    public void test2() {

        LoggerFactory factory = (LoggerFactory) XMLUtils.getBean();

        Logger logger = factory.createLogger();
        logger.writeLog();

    }
}
