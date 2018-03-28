### 扩展


工厂方法模式扩展之:  `隐藏工厂方法`  
接口改为抽象类

````
为了进一步简化客户端的使用, 可以对客户端隐藏工厂方法.  
此时, 客户端直接通过工厂即可使用所创建的对象中的业务方法.
````

````
abstract class LoggerFactory {
	public void writeLog() {
	Logger logger = this.createLogger();
			
	logger.writeLog();
	}

	public abstract Logger createLogger();
}
````
````
class Client {
	public void test() {
		LoggerFactory factory = (LoggerFactory)XMLUtils.getBean();
		// 直接使用工厂对象来调用产品对象的业务方法, 客户端无需使用工厂方法
		factory.writeLog();
	}

}
````

details in <design-pattern-java> Page 61
