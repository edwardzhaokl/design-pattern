package dp.creational.prototype.demo;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-03-18 23:25:16
 * version: 1.0
 * desc: Client 角色: 获取克隆对象
 * <p>
 **/

public class Client {

	@Test
	public void test() {
		Prototype prototype = new ConcretePrototype();
		((ConcretePrototype)prototype).setAttribute("test");

		Prototype prototype1 = prototype.clone();
	}
}
