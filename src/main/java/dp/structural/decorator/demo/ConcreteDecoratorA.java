package dp.structural.decorator.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: ConcreteDecoratorA
 * author: zhaokl
 * creationTime: 2018-04-11 21:28:02
 * version: 1.0
 * desc: 具体装饰器 A
 * <p>
 **/

@Slf4j
public class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void operator() {
		super.operator();
		addBehavior();
	}

	public void addBehavior() {
		log.info("ConcreteDecoratorA::addBehavior::parameters:{ " + "" + "}");
	}

}
