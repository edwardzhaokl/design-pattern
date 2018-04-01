package dp.structural.adapter.demo.clazz;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * clazz: Adapter
 * author: zhaokl
 * creationTime: 2018-04-01 18:25:30
 * version: 1.0
 * desc: 适配器/包装类
 * <p>
 **/

@Slf4j
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		log.info("Adapter::request::parameters:{ " + "" + "}");

		specificRequest();
	}

}
