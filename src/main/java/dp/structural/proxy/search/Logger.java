package dp.structural.proxy.search;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: Logger
 * author: zhaokl
 * creationTime: 2018-04-03 23:26:52
 * version: 1.0
 * desc: 日志记录
 * <p>
 **/

@Slf4j
public class Logger {

	public void log(String userId) {
		log.info("Logger::log::parameters:{ " + "userId = [" + userId + "]" + "}");
	}
}
