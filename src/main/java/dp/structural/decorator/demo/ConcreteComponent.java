package dp.structural.decorator.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: ConcreteComponent
 * author: zhaokl
 * creationTime: 2018-04-11 20:37:11
 * version: 1.0
 * desc: 具体组件
 * <p>
 **/

@Slf4j
public class ConcreteComponent extends Component {

	@Override
	public void operator() {
		log.info("ConcreteComponent::operator::parameters:{ " + "" + "}");
	}
	
}
