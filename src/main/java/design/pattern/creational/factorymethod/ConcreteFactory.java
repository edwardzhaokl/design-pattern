package design.pattern.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhaokl
 * <p>
 * created at: 08/12/2017 14:36
 * <p>
 * desc:
 */
@Slf4j
public class ConcreteFactory extends Factory {

	private final void test(){}

    // @Override
    public static Product factoryMethod() {
        log.info("create concrete product 1");

        //return new ConcreteProduct1();

        return null;
    }
}
