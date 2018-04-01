package dp.structural.adapter.demo.object;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-01 19:31:39
 * version: 1.0
 * desc:
 * <p>
 **/

public class Client {

	@Test
	public void test() {
		Target target = new Adapter();

		target.request();
	}
}
