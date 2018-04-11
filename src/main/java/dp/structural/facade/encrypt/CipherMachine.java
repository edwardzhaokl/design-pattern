package dp.structural.facade.encrypt;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: CipherMachine
 * author: zhaokl
 * creationTime: 2018-04-04 15:46:32
 * version: 1.0
 * desc: 加密
 * <p>
 **/

@Slf4j
public class CipherMachine {

	public String encrypt(String plainText) {
		log.info("CipherMachine::encrypt::parameters:{ " + "plainText = [" + plainText + "]" + "}");
		return plainText.intern();
	}
}
