package dp.creational.abstractfactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * clazz: ConcreteProductB2
 * author: zhaokl
 * creationTime: 2018-03-14 20:32:20
 * version: 1.0
 * desc: concrete product B2: 具体产品 B2
 * <p>
 **/

@Slf4j
public class ConcreteProductB2 extends ProductB {

	@Override
	public void businessMethodB() {
		log.info("ConcreteProductB2::businessMethodB::parameters:{ " + "" + "}");
	}
}
