package dp.structural.facade.demo;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-04 14:34:55
 * version: 1.0
 * desc: 测试
 * <p>
 **/

public class Client {

	@Test
	public void test() {
		Facade facade = new Facade();

		facade.method();
	}
}
