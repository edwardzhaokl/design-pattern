package dp.creational.builder.demo;

/**
 * project: design-pattern
 * clazz: Builder
 * author: zhaokl
 * creationTime: 2018-03-18 14:23:20
 * version: 1.0
 * desc: Builder角色: 抽象建造者
 * <p>
 **/

public abstract class Builder {

	protected Product product = new Product();

	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract void buildPartC();

	public Product getProduct() {
		return product;
	}
}
