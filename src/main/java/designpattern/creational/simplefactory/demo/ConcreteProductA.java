package designpattern.creational.simplefactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 22:11:39
 * desc: concrete product A
 * <p>
 **/

@Slf4j
public class ConcreteProductA extends Product {

    @Override
    public void diffMethod() {
        log.info("ConcreteProductA1::diffMethod::parameters:{ " + "" + "}");
    }
}
