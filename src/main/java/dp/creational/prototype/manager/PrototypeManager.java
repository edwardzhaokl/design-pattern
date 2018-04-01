package dp.creational.prototype.manager;

import java.util.Hashtable;

/**
 * project: design-pattern
 * clazz: PrototypeManager
 * author: zhaokl
 * creationTime: 2018-03-28 21:20:29
 * version: 1.0
 * desc: 原型管理器
 * 		原型管理器是将多个原型对象存储在一个集合中供客户端使用,
 * 		是一个专门负责克隆对象的工厂,
 * 		其中定义了一个集合用于存储原型对象.
 * <p>
 **/

public class PrototypeManager {

	private Hashtable<String, OfficialDocument> hashtable = new Hashtable<>();
	private static PrototypeManager prototypeManager = new PrototypeManager();

	private PrototypeManager() {
		hashtable.put("far", new FAR());
		hashtable.put("srs", new SRS());
	}

	public static PrototypeManager getPrototypeManager() {
		return prototypeManager;
	}

	public OfficialDocument getOfficialDocument(String key) {
		return prototypeManager.hashtable.get(key).clone();
	}

}
