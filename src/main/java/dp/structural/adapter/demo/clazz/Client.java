package dp.structural.adapter.demo.clazz;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-01 18:31:35
 * version: 1.0
 * desc: 测试 - 典型客户端代码
 * <p>
 **/

@Slf4j
public class Client {

	@Test
	public void test1() {
		// 针对抽象目标接口编程
		Target target = new Adapter();

		target.request();
	}
}
