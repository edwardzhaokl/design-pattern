package dp.creational.factorymethod.log.hidefactorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 21:19:25
 * desc: concrete factory: 具体工厂2
 * <p>
 **/

@Slf4j
public class FileLoggerFactory extends LoggerFactory {

    /**
    @Override
    public void writeLog() {

    }
    */

    @Override
    public Logger createLogger() {
        log.info("FileLoggerFactory::createFileLogger::parameters:{ " + "" + "}");

        return new FileLogger();
    }

}
