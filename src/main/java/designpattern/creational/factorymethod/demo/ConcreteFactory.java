package designpattern.creational.factorymethod.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 19:00:49
 * desc: concrete factory: 具体工厂类
 * <p>
 **/

@Slf4j
public class ConcreteFactory extends Factory {

    @Override
    public Product factoryMethod() {
        log.info("ConcreteFactory2::factoryMethod::parameters:{ " + "" + "}");
        return new ConcreteProduct();
    }

}
