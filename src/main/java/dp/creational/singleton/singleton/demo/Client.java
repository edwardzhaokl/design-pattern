package dp.creational.singleton.singleton.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-03-15 21:27:05
 * version: 1.0
 * desc: client: 测试
 * <p>
 **/

@Slf4j
public class Client {

	@Test
	public void test() {

		Singleton s = Singleton.getInstance();

		Singleton s1 = Singleton.getInstance();

		log.info("s == s1 is " + (s == s1));

	}
}
