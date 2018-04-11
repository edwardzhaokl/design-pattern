package dp.structural.facade.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: Facade
 * author: zhaokl
 * creationTime: 2018-04-04 14:17:38
 * version: 1.0
 * desc: 外观类
 * <p>
 **/

@Slf4j
public class Facade {

	private SubSystemA subSystemA = new SubSystemA();

	private SubSystemB subSystemB = new SubSystemB();

	private SubSystemC subSystemC = new SubSystemC();

	public void method() {
		log.info("Facade::method::parameters:{ " + "" + "}");
		subSystemA.method();
		subSystemB.method();
		subSystemC.method();
	}
}
