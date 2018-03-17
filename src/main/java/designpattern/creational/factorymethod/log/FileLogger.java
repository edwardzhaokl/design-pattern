package designpattern.creational.factorymethod.log;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 21:14:47
 * desc: concreate product: 具体产品1
 * <p>
 **/

@Slf4j
public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        log.info("FileLogger::writeLog::parameters:{ " + "" + "}");
    }
}
