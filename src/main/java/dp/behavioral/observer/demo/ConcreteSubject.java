package dp.behavioral.observer.demo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * project: design-pattern
 * class: ConcreteSubject
 * author: zhaokl
 * creationTime: 2018-04-11 23:34:15
 * version: 1.0
 * desc: 具体目标
 * <p>
 **/

@Data
@EqualsAndHashCode(callSuper = true)
public class ConcreteSubject extends Subject {

	@Override
	public void notifyObservers(int state) {
		for (Observer o : observers) {
			o.update(state);
		}
	}
}
