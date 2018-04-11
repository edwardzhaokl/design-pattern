package dp.structural.decorator.demo;

/**
 * project: design-pattern
 * class: Decorator
 * author: zhaokl
 * creationTime: 2018-04-11 21:20:08
 * version: 1.0
 * desc: 装饰器
 * <p>
 **/

public class Decorator extends Component{

	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	public void operator() {
		component.operator();
	}
}
