package dp.structural.proxy.search;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-03 23:30:00
 * version: 1.0
 * desc: 测试
 * <p>
 **/

public class Client {

	@Test
	public void test() {
		Searcher searcher = new ProxySearcher();

		searcher.doSearch("userId", "key");
	}
}
