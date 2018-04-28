package dp.behavioral.command.demo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: Invoker
 * author: zhaokl
 * creationTime: 2018-04-28 11:24:17
 * version: 1.0
 * desc: 调用者, 要去该执行请求
 * <p>
 **/

@Slf4j
@Data
public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}
	
	public void call() {
		log.info("Invoker::call::parameters:{ " + "" + "}");

		command.execute();
	}
}
