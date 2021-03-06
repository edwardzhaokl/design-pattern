package dp.creational.prototype.deepcopy;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * project: design-pattern
 * clazz: Attachment
 * author: zhaokl
 * creationTime: 2018-03-27 22:36:49
 * version: 1.0
 * desc: weekLog的成员变量
 * <p>
 **/

@Slf4j
public class Attachment implements Serializable {

	private String name;

	public void download() {
		log.info("downloading attachment, file name is {}", name);
	}
}
