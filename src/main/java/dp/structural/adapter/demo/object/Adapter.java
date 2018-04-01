package dp.structural.adapter.demo.object;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: Adapter
 * author: zhaokl
 * creationTime: 2018-04-01 19:29:13
 * version: 1.0
 * desc: 适配器 wrapper
 * <p>
 **/

@Slf4j
public class Adapter extends Target {

	private Adaptee adaptee;

	public Adapter() {
		this.adaptee = new Adaptee();
	}
	
	@Override
	public void request() {
		log.info("Adapter::request::parameters:{ " + "" + "}");
		adaptee.specificRequest();
	}

}
