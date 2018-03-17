package design.pattern.creational.abstractfactory.demo;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-13 23:17:24
 * desc: client : 测试
 * <p>
 **/

public class Client {

	@Test
	public void test() {

		Factory factory1 = new ConcreteFactory1();
		ProductA productA1 = factory1.createProductA();
		ProductB productB1 = factory1.createProductB();

		Factory factory2 = new ConcreteFactory2();
		ProductA productA2 = factory2.createProductA();
		ProductB productB2 = factory2.createProductB();

		productA1.businessMethodA();
		productB1.businessMethodB();

		productA2.businessMethodA();
		productB2.businessMethodB();

	}
}
