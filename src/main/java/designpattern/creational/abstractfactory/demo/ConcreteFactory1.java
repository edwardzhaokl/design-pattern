package design.pattern.creational.abstractfactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-12 10:13:45
 * desc: concrete factory 1: 具体工厂1
 * <p>
 **/

@Slf4j
public class ConcreteFactory1 extends Factory {

    @Override
    ProductA createProductA() {
        log.info("ConcreteFactory1::createProductA::parameters:{ " + "" + "}");

        return new ConcreteProductA1();
    }

    @Override
    ProductB createProductB() {
        log.info("ConcreteFactory1::createProductB::parameters:{ " + "" + "}");

        return new ConcreteProductB1();
    }

}
