package dp.structural.facade.encrypt;

import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-04 15:54:48
 * version: 1.0
 * desc: 测试
 * <p>
 **/

public class Client {

	@Test
	public void test() {
		EncryptFacade encryptFacade = new EncryptFacade();
		encryptFacade.fileEncrypt("a", "b");
	}
}
