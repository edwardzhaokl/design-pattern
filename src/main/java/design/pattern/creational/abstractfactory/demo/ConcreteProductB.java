package design.pattern.creational.abstractfactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-12 09:46:11
 * desc: concrete product B: 具体产品 B
 * <p>
 **/

@Slf4j
public class ConcreteProductB extends Product{

    @Override
    void businessMethod() {
        log.info("ConcreteProductB::businessMethod::parameters:{ " + "" + "}");
    }
    
}
