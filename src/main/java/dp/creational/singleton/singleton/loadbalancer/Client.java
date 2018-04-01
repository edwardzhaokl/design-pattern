package dp.creational.singleton.singleton.loadbalancer;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * clazz: Client
 * author: zhaokl
 * creationTime: 2018-03-15 23:29:57
 * version: 1.0
 * desc: 测试客户端
 * <p>
 **/

public class Client {

	@Test
	public void test() {

		LoadBalancer loadBalancer1 = LoadBalancer.getInstance();
		LoadBalancer loadBalancer2 = LoadBalancer.getInstance();
		LoadBalancer loadBalancer3 = LoadBalancer.getInstance();
		LoadBalancer loadBalancer4 = LoadBalancer.getInstance();

		loadBalancer1.addServer("server1");
		loadBalancer2.addServer("server2");
		loadBalancer3.addServer("server3");
		loadBalancer4.addServer("server4");

		for (int i = 1; i < 10; ++i) {
			loadBalancer2.getServer();
		}

	}
}
