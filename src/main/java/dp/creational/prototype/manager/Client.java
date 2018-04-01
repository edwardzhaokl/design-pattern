package dp.creational.prototype.manager;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * clazz: Client
 * author: zhaokl
 * creationTime: 2018-03-28 21:58:59
 * version: 1.0
 * desc: 测试
 * <p>
 **/

@Slf4j
public class Client {

	@Test
	public void test() {

		PrototypeManager prototypeManager = PrototypeManager.getPrototypeManager();

		OfficialDocument doc1 = prototypeManager.getOfficialDocument("far");
		doc1.display();
		OfficialDocument doc2 = prototypeManager.getOfficialDocument("far");
		doc2.display();

		log.info("doc1 == doc2 is: {}", doc1 == doc2);
	}
}
