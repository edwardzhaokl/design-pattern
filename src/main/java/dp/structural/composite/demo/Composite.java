package dp.structural.composite.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * project: design-pattern
 * class: Composite
 * author: zhaokl
 * creationTime: 2018-04-06 23:22:14
 * version: 1.0
 * desc: 容器构件
 * <p>
 **/

public class Composite extends Component {

	private List<Component> components = new ArrayList<>();

	@Override
	public void add(Component component) {
		components.add(component);
	}

	@Override
	public void remove(Component component) {
		components.remove(component);
	}

	@Override
	public Component getChild(int i) {
		if (i >= components.size()) {
			return null;
		}
		return components.get(i);
	}

	@Override
	public void operation() {
		for (Component c : components) {
			c.operation();
		}
	}
}
