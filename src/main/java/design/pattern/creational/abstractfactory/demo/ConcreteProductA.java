package design.pattern.creational.abstractfactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-12 09:41:36
 * desc: concrete product A: 具体产品 A
 * <p>
 **/

@Slf4j
public class ConcreteProductA extends Product{

    @Override
    void businessMethod() {
        log.info("ConcreteProductA::businessMethod::parameters:{ " + "" + "}");
    }
}
