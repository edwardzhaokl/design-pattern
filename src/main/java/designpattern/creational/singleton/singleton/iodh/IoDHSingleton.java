package design.pattern.creational.singleton.singleton.iodh;

/**
 * project: design-pattern
 * class: IoDHSingleton
 * author: zhaokl
 * creationTime: 2018-03-18 00:25:52
 * version: 1.0
 * desc: IoDH: Initialization on Demand Holder
 * <p>
 * 饿汉式单例不能实现延迟加载, 将始终占据内存;
 * 懒汉式单例线程安全控制繁琐, 且性能受影响(volatile 关键字会屏蔽虚拟机做的一些优化)
 **/

// 增加一个 static 内部类
/**
 * 解析:
 * 1. 类加载时不会实例化 IoDHSingleton
 * 2. 第一次调用 getInstance()时加载内部类 HolderClass,
 * 3. 初始化内部类的 static 的成员变量,
 * 4. 由 Java 虚拟机保证其线程安全性, 确保该成员变量只能初始化一次
 * 5. 由于没有线程锁定, 因此不会影响其性能
 */
public class IoDHSingleton {

	private IoDHSingleton() {}

	private static class HolderClass{
		private final static IoDHSingleton instance = new IoDHSingleton();
	}

	public static IoDHSingleton getInstance() {
		return HolderClass.instance;
	}



}
