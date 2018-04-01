package dp.structural.adapter.demo.object;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: Adaptee
 * author: zhaokl
 * creationTime: 2018-04-01 19:28:21
 * version: 1.0
 * desc: 被适配的
 * <p>
 **/

@Slf4j
public class Adaptee {

	public void specificRequest() {
		log.info("Adaptee::specificRequest::parameters:{ " + "" + "}");
	}
}
