package dp.behavioral.strategy.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: Context
 * author: zhaokl
 * creationTime: 2018-04-28 17:09:48
 * version: 1.0
 * desc:	环境类
 * <p>
 **/

@Slf4j
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void algorithm() {
		log.info("Context::algorithm::parameters:{ " + "" + "}");
		strategy.algorithm();
	}
}
