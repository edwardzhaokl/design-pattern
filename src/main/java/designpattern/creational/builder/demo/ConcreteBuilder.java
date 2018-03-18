package designpattern.creational.builder.demo;

/**
 * project: design-pattern
 * class: ConcreteBuilder
 * author: zhaokl
 * creationTime: 2018-03-18 14:25:47
 * version: 1.0
 * desc: ConcreteBuilder 角色: 具体建造者
 * <p>
 **/

public class ConcreteBuilder extends Builder {

	@Override
	public void buildPartA() {
		product.setPartA("partA");
	}

	@Override
	public void buildPartB() {
		product.setPartB("partB");
	}

	@Override
	public void buildPartC() {
		product.setPartC("partC");
	}

}
