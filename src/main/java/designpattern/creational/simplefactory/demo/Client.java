package designpattern.creational.simplefactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 22:34:37
 * desc: client
 * <p>
 **/

@Slf4j
public class Client {

    public static void main(String[] args) {
        Product product;
        // 通过工厂类创建产品对象
        product = Factory.getProduct("a");

        product.sameMethod();
        product.diffMethod();
    }
}
