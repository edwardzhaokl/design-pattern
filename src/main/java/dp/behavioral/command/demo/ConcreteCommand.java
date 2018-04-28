package dp.behavioral.command.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: ConcreteCommand
 * author: zhaokl
 * creationTime: 2018-04-28 13:42:27
 * version: 1.0
 * desc: 具体命令
 * 		将一个接收者对象绑定于一个动作;
 * 		调用接收者相应的操作, 以实现 execute();
 * <p>
 **/

@Slf4j
public class ConcreteCommand extends Command {

	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		log.info("ConcreteCommand::execute::parameters:{ " + "" + "}");
		receiver.action();
	}
}
