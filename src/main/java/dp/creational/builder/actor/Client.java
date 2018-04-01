package dp.creational.builder.actor;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * clazz: Client
 * author: zhaokl
 * creationTime: 2018-03-18 17:54:31
 * version: 1.0
 * desc: 测试
 * <p>
 **/

public class Client {

	@Test
	public void test1() {
		ActorBuilder builder = new HeroBuilder();
		ActorController director = new ActorController(builder);

		director.construct();

	}
}
