package designpattern.creational.prototype.deepcopy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
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

	public static boolean equals(Object a, Object b) {
		return (a == b) || (a != null && a.equals(b));
	}

	@Test
	public void test() throws IOException, ClassNotFoundException {
		WeeklyLog log1 = new WeeklyLog();
		log1.setName("name");
		log1.setDate(new Date());
		log1.setContent("content");
		log1.setAttachment(new Attachment());

		WeeklyLog log2 = log1.clone();
		log.info("log1 == log2 is {}", Objects.equals(log1, log2));
		log.info("log1.getName() == log2.getName() is {}", Objects.equals(log1.getName(), log2.getName()));
		log.info("log1.getAttachment() == log2.getAttachment() is {}", log1.getAttachment() == log2.getAttachment());

		WeeklyLog log3 = log1.deepClone();
		log.info("log1 == log2 is {}", Objects.equals(log1, log3));
		log.info("log1.getName() == log3.getName() is {}", Objects.equals(log1.getName(), log3.getName()));
		log.info("log1.getAttachment() == log3.getAttachment() is {}",
				 Objects.equals(log1.getAttachment(), log3.getAttachment())
		);
		log.info("log1.getAttachment() == log3.getAttachment() is {}", log1.getAttachment() == log3.getAttachment());

		Attachment a = log1.getAttachment();
		Attachment b = log3.getAttachment();
		log.info("result = {}", (a == b) || (a != null && a.equals(b)));


	}
}
