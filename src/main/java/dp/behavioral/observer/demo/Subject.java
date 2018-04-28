package dp.behavioral.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * project: design-pattern
 * class: Subject
 * author: zhaokl
 * creationTime: 2018-04-11 23:29:46
 * version: 1.0
 * desc: 抽象目标
 * <p>
 **/

public abstract class Subject {

	protected int state;

	protected List<Observer> observers = new ArrayList<>();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void setState(int state) {
		this.state = state;
		notifyObservers(state);
	}

	public abstract void notifyObservers(int state);

	public int getState() {
		return state;
	}
}
