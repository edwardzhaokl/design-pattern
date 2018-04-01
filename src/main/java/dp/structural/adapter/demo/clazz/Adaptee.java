package dp.structural.adapter.demo.clazz;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * clazz: Adaptee
 * author: zhaokl
 * creationTime: 2018-04-01 18:24:28
 * version: 1.0
 * desc: 被适配的类
 * <p>
 **/

@Slf4j
public class Adaptee {

	public void specificRequest() {
		log.info("Adaptee::specificRequest::parameters:{ " + "" + "}");
	}
}
