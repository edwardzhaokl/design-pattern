package designpattern.creational.builder.demo;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-03-18 14:29:22
 * version: 1.0
 * desc: 测试类
 * <p>
 **/

public class Client {

	@Test
	public void test() {
		Builder builder = new ConcreteBuilder();

		Director director = new Director(builder);

		Product product = director.getProduct();
	}
}
