package dp.behavioral.observer.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;


/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-11 23:38:25
 * version: 1.0
 * desc: 测试
 * <p>
 **/

@Slf4j
public class Client {

	@Test
	public void test() {
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();

		Subject subject = new ConcreteSubject();
		subject.attach(observer1);
		subject.attach(observer2);

		subject.setState(1);

		log.info("observer1 = {}", observer1);
		log.info("observer2 = {}", observer2);

	}
}
