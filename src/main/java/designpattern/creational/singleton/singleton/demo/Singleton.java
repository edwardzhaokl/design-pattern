package designpattern.creational.singleton.singleton.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: Singleton
 * author: zhaokl
 * creationTime: 2018-03-15 21:17:34
 * version: 1.0
 * desc: singleton pattern: 单例模式
 * <p>
 **/

@Slf4j
public class Singleton {

	private Singleton(){
		log.info("Singleton::Singleton::parameters:{ " + "" + "}");
	}

	private static Singleton singleton;

	public static Singleton getInstance() {
		log.info("Singleton::getInstance::parameters:{ " + "" + "}");
		
		if (null == singleton) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
