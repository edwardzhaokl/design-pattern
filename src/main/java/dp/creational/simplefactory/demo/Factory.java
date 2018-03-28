package dp.creational.simplefactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 22:04:16
 * desc: factory class
 * <p>
 **/

@Slf4j
public class Factory {

    public static Product getProduct(String type) {
        Product product = null;

        if ("a".equals(type)) {
            product = new ConcreteProductA();
            // 初始化 product
        } else if ("b".equals(type)) {
            product = new ConcreteProductB();
            // 初始化 product
        }

        if (null != product) {
            return product;
        }

        return new Product() {
            @Override
            public void diffMethod() {
                log.info("Factory::diffMethod::parameters:{ " + "" + "}");
            }
        };
    }
}
