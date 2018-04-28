package dp.behavioral.command.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: Command
 * author: zhaokl
 * creationTime: 2018-04-28 10:09:44
 * version: 1.0
 * desc: 抽象命令 声明执行操作的接口
 * <p>
 **/

@Slf4j
public abstract class Command {

	public abstract void execute();
}
