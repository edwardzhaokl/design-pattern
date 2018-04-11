package dp.structural.composite.demo;

/**
 * project: design-pattern
 * class: Component
 * author: zhaokl
 * creationTime: 2018-04-06 23:15:56
 * version: 1.0
 * desc: 抽象构件类
 * <p>
 **/

public abstract class Component {

	public abstract void add(Component component);

	public abstract void remove(Component component);

	public abstract Component getChild(int i);

	// 业务方法
	public abstract void operation();
}
