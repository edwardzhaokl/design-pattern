package design.pattern.creational.factorymethod.log;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 21:15:52
 * desc: concreate product: 具体产品2
 * <p>
 **/

@Slf4j
public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        log.info("DatabaseLogger::writeLog::parameters:{ " + "" + "}");
    }
}
