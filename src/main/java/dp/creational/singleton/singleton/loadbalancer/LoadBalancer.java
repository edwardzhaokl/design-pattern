package dp.creational.singleton.singleton.loadbalancer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * project: design-pattern
 * class: LoadBalancer
 * author: zhaokl
 * creationTime: 2018-03-15 23:09:38
 * version: 1.0
 * desc: 负载均衡处理器: 单例
 * <p>
 **/

@Slf4j
public class LoadBalancer {

	private static LoadBalancer instance;

	private List<String> serverList;

	private LoadBalancer(){
		serverList = new ArrayList<>();
	}

	// 增加服务器
	public void addServer(String server) {
		serverList.add(server);
	}

	// 删除服务器
	public void removeServer(String server) {
		serverList.remove(server);
	}

	// 随机获取服务器
	public String getServer() {
		Random random = new Random();
		int index = random.nextInt(4);

		log.info("LoadBalancer::getServer" + index);
		return serverList.get(index);
	}

	public static LoadBalancer getInstance() {
		if (null == instance) {
			instance = new LoadBalancer();
		}
		return instance;
	}
}
