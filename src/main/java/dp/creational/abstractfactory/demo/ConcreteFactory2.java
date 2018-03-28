package dp.creational.abstractfactory.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-13 23:15:28
 * desc: concrete factory 2: 具体工厂2
 * <p>
 **/

@Slf4j
public class ConcreteFactory2 extends Factory{

	@Override
	ProductA createProductA() {
		log.info("ConcreteFactory2::createProductA::parameters:{ " + "" + "}");

		return new ConcreteProductA1();
	}

	@Override
	ProductB createProductB() {
		log.info("ConcreteFactory2::createProductB::parameters:{ " + "" + "}");

		return new ConcreteProductB2();
	}

}
