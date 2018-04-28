package dp.behavioral.command.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: Receiver
 * author: zhaokl
 * creationTime: 2018-04-28 11:22:14
 * version: 1.0
 * desc: 命令的接受者, 知道如何执行一个请求的操作
 * <p>
 **/

@Slf4j
public class Receiver {

	public void action() {
		log.info("Receiver::action::parameters:{ " + "" + "}");
	}
}
