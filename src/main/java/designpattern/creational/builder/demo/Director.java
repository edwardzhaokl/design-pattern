package designpattern.creational.builder.demo;

/**
 * project: design-pattern
 * class: Director
 * author: zhaokl
 * creationTime: 2018-03-18 14:27:12
 * version: 1.0
 * desc: Director 角色: 导演类, 负责调用 builder 创建 product
 * <p>
 **/

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void setDirector(Builder builder) {
		this.builder = builder;
	}

	public Product getProduct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();

		return builder.getProduct();
	}

}
