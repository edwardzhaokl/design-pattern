package dp.structural.composite.demo;

/**
 * project: design-pattern
 * class: Leaf
 * author: zhaokl
 * creationTime: 2018-04-06 23:20:34
 * version: 1.0
 * desc: 叶子节点
 * <p>
 **/

public class Leaf extends Component {

	@Override
	public void add(Component component) {
		// 异常或错误处理
	}

	@Override
	public void remove(Component component) {
		// 异常或错误处理
	}

	@Override
	public Component getChild(int i) {
		// 异常或错误处理
		return null;
	}

	@Override
	public void operation() {
		// 叶子节点的具体业务实现
	}

}
