package design.pattern.creational.factorymethod.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 18:59:30
 * desc: concrete product: 具体产品
 * <p>
 **/

@Slf4j
public class ConcreteProduct extends Product {

    @Override
    public void sameMethod() {

        log.info("ConcreteProduct::sameMethod::parameters:{ " + "" + "}");
    }
}
