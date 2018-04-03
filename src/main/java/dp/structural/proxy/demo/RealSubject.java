package dp.structural.proxy.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: RealSubject
 * author: zhaokl
 * creationTime: 2018-04-03 22:03:24
 * version: 1.0
 * desc: 真实主题角色
 * <p>
 **/

@Slf4j
public class RealSubject extends Subject {

	@Override
	public void request() {
		log.info("RealSubject::request::parameters:{ " + "" + "}");;
	}


}
