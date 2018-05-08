package dp.behavioral.strategy.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: ConcreteStrategy
 * author: zhaokl
 * creationTime: 2018-04-28 17:09:07
 * version: 1.0
 * desc: 具体策略
 * <p>
 **/

@Slf4j
public class ConcreteStrategy extends Strategy {

	@Override
	public void algorithm() {
		log.info("ConcreteStrategy::algorithm::parameters:{ " + "" + "}");
	}
	
}
