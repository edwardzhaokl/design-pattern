package dp.creational.singleton.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * clazz: LazySingleton
 * author: zhaokl
 * creationTime: 2018-03-18 00:06:58
 * version: 1.0
 * desc: 懒汉模式单例
 * <p>
 **/

@Slf4j
public class LazySingleton {

	private LazySingleton() {}

	// 如果使用 双重检查锁定 来实现懒汉式单例类,
	// instance 前必须加 volatile 关键字
	// 被 volatile 修饰的成员变量可以确保多个线程都能正确处理,
	// 且该代码只能在 JDK1.5以上版本中才能正确执行.
	private volatile static LazySingleton instance;

	// 使用 double check
	public static LazySingleton getInstance() {
		// 第一重检查
		if (null == instance) {
			// 锁定代码块
			synchronized (LazySingleton.class) {
				// 第二重检查
				if (null == instance) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
