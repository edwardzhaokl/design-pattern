package dp.creational.prototype.weeklylog;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Objects;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-03-27 22:02:49
 * version: 1.0
 * desc: 测试
 * <p>
 **/

@Slf4j
public class Client {

	@Test
	public void test() {
		WeeklyLog log1 = new WeeklyLog();
		log1.setName("name");
		log1.setDate(new Date());
		log1.setContent("content");

		WeeklyLog log2 = log1.clone();

		log.info("log2 = {}", log2);

		log.info("log1.getName() == log2.getName() is {}", Objects.equals(log1.getName(), log2.getName()));
		log.info("log1.getDate() == log2.getDate() is {}", Objects.equals(log1.getDate(), log2.getDate()));
	}
}
