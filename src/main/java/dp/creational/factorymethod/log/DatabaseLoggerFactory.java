package dp.creational.factorymethod.log;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 21:19:25
 * desc: concreate factory: 具体工厂2
 * <p>
 **/

@Slf4j
public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        log.info("FileLoggerFactory::createDatabaseLogger::parameters:{ " + "" + "}");

        return new DatabaseLogger();
    }

}
