package dp.creational.builder.omitdirector;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * clazz: ConcreteBuilder
 * author: zhaokl
 * creationTime: 2018-03-18 14:25:47
 * version: 1.0
 * desc: ConcreteBuilder 角色: 具体建造者
 * <p>
 **/

@Slf4j
public class ConcreteBuilder extends Builder {

	@Override
	public void buildPartA() {
		log.info("ConcreteBuilder::buildPartA::parameters:{ " + "" + "}");
		product.setPartA("partA");
	}

	@Override
	public void buildPartB() {
		log.info("ConcreteBuilder::buildPartB::parameters:{ " + "" + "}");
		product.setPartB("partB");
	}

	@Override
	public void buildPartC() {
		log.info("ConcreteBuilder::buildPartC::parameters:{ " + "" + "}");
		product.setPartC("partC");
	}

}
