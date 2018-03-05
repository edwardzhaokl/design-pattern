package design.pattern.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * author: zhaokl
 * <p>
 * created at: 08/12/2017 16:06
 * <p>
 * desc:
 */
@Slf4j
public class Client {

    public static void main(String[] args) {

        //Factory factory = new ConcreteFactory();

	    Map<String, Object> map = new HashMap<>();

	    map.put("1", "one");
	    map.put("2", "two");

	    log.info(map.entrySet().toString());


	    log.info("get " + map.get("3"));

	    log.info("getOrDefault " + map.getOrDefault("3", "three"));

		Runnable r = () -> System.out.println("hello world");

		r.run();

		new Thread(() ->
			System.out.println("hello world")
		).start();


	    Consumer<Integer> c = System.out::println;

    }

}
