package designpattern.creational.simplefactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 22:10:14
 * desc: abstract product
 * <p>
 **/

@Slf4j
public abstract class Product {

    // 所有产品的公共方法
    public void sameMethod() {
        log.info("ProductA::sameMethod::parameters:{ " + "" + "}");
    }

    // 声明抽象业务方法
    public abstract void diffMethod();
}
