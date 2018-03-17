package designpattern.creational.factorymethod.log;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 21:13:00
 * desc: abstract factory: 抽象工厂, 由接口表示
 * <p>
 **/

interface LoggerFactory {

    public Logger createLogger();
}
