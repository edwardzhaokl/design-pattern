package designpattern.creational.abstractfactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-12 09:41:36
 * desc: concrete product A1: 具体产品 A1
 * <p>
 **/

@Slf4j
public class ConcreteProductA1 extends ProductA {

    @Override
    void businessMethodA() {
        log.info("ConcreteProductA1::businessMethodA::parameters:{ " + "" + "}");
    }
}
