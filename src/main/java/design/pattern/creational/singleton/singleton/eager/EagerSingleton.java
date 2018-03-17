package design.pattern.creational.singleton.singleton.eager;

/**
 * project: design-pattern
 * class: EagerSingleton
 * author: zhaokl
 * creationTime: 2018-03-16 21:04:36
 * version: 1.0
 * desc: 饿汉式单例
 * <p>
 **/

public class EagerSingleton {

	private EagerSingleton(){}

	private static EagerSingleton instance = new EagerSingleton();

	public static EagerSingleton getInstance(){
		return instance;
	}

}
