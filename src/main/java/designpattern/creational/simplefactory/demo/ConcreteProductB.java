package design.pattern.creational.simplefactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 22:32:43
 * desc: concrete product B
 * <p>
 **/

@Slf4j
public class ConcreteProductB extends Product {

    @Override
    public void diffMethod() {
    
        log.info("ConcreteProductA2::diffMethod::parameters:{ " + "" + "}");
    }
    
}
