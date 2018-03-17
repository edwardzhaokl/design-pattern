package design.pattern.creational.factorymethod.demo;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-11 19:02:08
 * desc: client: 测试
 * <p>
 **/

public class Client {

    @Test
    public void test1() {

        //  实际使用中应配置化的动态指定哪个 concrete factory
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();

        product.sameMethod();
    }
}
