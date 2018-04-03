package dp.structural.proxy.search;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: AccessValidator
 * author: zhaokl
 * creationTime: 2018-04-03 23:23:40
 * version: 1.0
 * desc: 登陆校验类
 * <p>
 **/

@Slf4j
public class AccessValidator {

	public boolean validator(String userId) {
		log.info("验证 userId, AccessValidator::validator::parameters:{ " + "userId = [" + userId + "]" + "}");
		if ("userId".equals(userId)) {
			log.info("{}登陆成功", userId);
			return true;
		} else {
			log.info("{}登陆失败", userId);
			return false;
		}

	}
}
