package dp.structural.decorator.demo;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-11 21:35:41
 * version: 1.0
 * desc:
 * <p>
 **/

public class Client {

	@Test
	public void test() {
		Component component = new ConcreteComponent();

		Decorator decorator = new ConcreteDecoratorA(component);

		decorator.operator();
	}
}
