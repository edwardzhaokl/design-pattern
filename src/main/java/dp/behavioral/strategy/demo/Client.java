package dp.behavioral.strategy.demo;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-28 17:11:49
 * version: 1.0
 * desc: 测试
 * <p>
 **/

public class Client {

	@Test
	public void test1() {

		Strategy strategy = new ConcreteStrategy();

		Context context = new Context(strategy);

		context.algorithm();
	}
}
