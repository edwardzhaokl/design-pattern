package design.pattern.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 22:11:39
 * desc: concrate product
 * <p>
 **/

@Slf4j
public class ConcreteProductA extends Product{

    @Override
    public void diffMethod() {
        log.info("ConcreteProductA::diffMethod::parameters:{ " + "" + "}");
    }
}
