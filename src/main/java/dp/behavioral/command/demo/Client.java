package dp.behavioral.command.demo;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-28 13:44:54
 * version: 1.0
 * desc: 测试客户端
 * <p>
 **/

public class Client {

	@Test
	public void test1() {
		Receiver receiver = new Receiver();

		Command command = new ConcreteCommand(receiver);

		Invoker invoker = new Invoker(command);

		invoker.call();
	}
}
