package dp.structural.proxy.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: Proxy
 * author: zhaokl
 * creationTime: 2018-04-03 22:04:31
 * version: 1.0
 * desc: 代理主题角色
 * <p>
 **/

@Slf4j
public class Proxy extends Subject {

	private RealSubject realSubject = new RealSubject();

	@Override
	public void request() {
		log.info("Proxy::request::parameters:{ " + "" + "}");
		preRequest();
		realSubject.request();
		afterRequest();
	}
	
	public void preRequest() {
		log.info("Proxy::preRequest::parameters:{ " + "" + "}");
	}
	
	public void afterRequest() {
		log.info("Proxy::afterRequest::parameters:{ " + "" + "}");
	}
	
}
