package dp.creational.factorymethod.log;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 21:16:59
 * desc: concrete factory: 具体工厂1
 * <p>
 **/

@Slf4j
public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        log.info("FileLoggerFactory::createFileLogger::parameters:{ " + "" + "}");

        return new FileLogger();
    }
}
