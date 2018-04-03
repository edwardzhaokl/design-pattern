package dp.structural.proxy.demo;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-03 22:05:55
 * version: 1.0
 * desc: 测试
 * <p>
 **/

public class Client {

	@Test
	public void test() {
		Subject subject = new Proxy();

		subject.request();
	}
}
