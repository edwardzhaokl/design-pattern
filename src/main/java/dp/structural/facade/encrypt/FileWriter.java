package dp.structural.facade.encrypt;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: FileWriter
 * author: zhaokl
 * creationTime: 2018-04-04 15:48:53
 * version: 1.0
 * desc: 输出文件
 * <p>
 **/

@Slf4j
public class FileWriter {

	public void write(String encryptText, String fileName) {
		log.info("FileWriter::write::parameters:{ " + "encryptText = [" + encryptText + "], fileName = [" + fileName + "]" + "}");
	}
}
