package dp.behavioral.observer.demo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: ConcreteObserver1
 * author: zhaokl
 * creationTime: 2018-04-11 23:35:41
 * version: 1.0
 * desc: 具体观察者
 * <p>
 **/

@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
public class ConcreteObserver2 extends Observer {

	private int observerState;

	@Override
	public void update(int state) {
		log.info("ConcreteObserver2::update::parameters:{ " + "" + "}");
		this.observerState = state;
	}

}
