package dp.creational.builder.omitdirector;

import dp.creational.builder.demo.Product;
import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * clazz: ActorBuilderV2
 * author: zhaokl
 * creationTime: 2018-03-18 18:50:19
 * version: 1.0
 * desc: Director 的高级应用方式1: 省略 Director
 * 		在 Builder 中提供逐步构建复杂产品对象的 construct()方法.
 * <p>
 **/

@Slf4j
public abstract class Builder {

	protected Product product;

	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract void buildPartC();

	public Product construct() {
		log.info("Builder::construct::parameters:{ " + "" + "}");
		product = new Product();

		buildPartA();
		buildPartB();
		buildPartC();

		return product;
	}
}
