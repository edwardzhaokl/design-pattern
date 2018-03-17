package designpattern.creational.abstractfactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: ConcreteProductB1
 * author: zhaokl
 * creationTime: 2018-03-14 20:31:05
 * version: 1.0
 * desc: concrete product B1: 具体产品 B1
 * <p>
 **/

@Slf4j
public class ConcreteProductB1 extends ProductB {

	@Override
	public void businessMethodB() {
		log.info("ConcreteProductB1::businessMethodB::parameters:{ " + "" + "}");
	}
	
}
