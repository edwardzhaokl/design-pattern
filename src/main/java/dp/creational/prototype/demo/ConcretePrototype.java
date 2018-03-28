package dp.creational.prototype.demo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * project: design-pattern
 * class: ConcretePrototype
 * author: zhaokl
 * creationTime: 2018-03-18 22:59:24
 * version: 1.0
 * desc: concrete prototype 角色: 具体原型
 * <p>
 **/

@Data
@EqualsAndHashCode(callSuper = true)
public class ConcretePrototype extends Prototype {

	private String attribute;

	@Override
	public Prototype clone() {
		Prototype prototype = new ConcretePrototype();
		((ConcretePrototype) prototype).setAttribute(this.attribute);
		return prototype;
	}
}
