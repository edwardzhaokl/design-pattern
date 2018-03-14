package design.pattern.creational.abstractfactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-12 09:46:11
 * desc: concrete product A2: 具体产品 A2
 * <p>
 **/

@Slf4j
public class ConcreteProductA2 extends ProductA {

    @Override
    void businessMethodA() {
        log.info("ConcreteProductA2::businessMethodA::parameters:{ " + "" + "}");
    }
    
}
