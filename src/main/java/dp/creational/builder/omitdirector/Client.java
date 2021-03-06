package dp.creational.builder.omitdirector;

import dp.creational.builder.demo.Product;
import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * clazz: Client
 * author: zhaokl
 * creationTime: 2018-03-18 19:02:17
 * version: 1.0
 * desc: 测试
 * <p>
 **/

public class Client {

	@Test
	public void test() {
		Builder builder = new ConcreteBuilder();

		Product product = builder.construct();
	}
}
