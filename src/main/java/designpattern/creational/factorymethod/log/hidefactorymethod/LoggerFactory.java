package designpattern.creational.factorymethod.log.hidefactorymethod;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 22:59:46
 * desc: trick 在此: 将接口改为抽象类, 业务直接写在抽象工厂中.
 * <p>
 **/

public abstract class LoggerFactory {

    public void writeLog() {
        Logger logger = this.createLogger();

        logger.writeLog();
    }

    public abstract Logger createLogger();
}
