package dp.structural.facade.encrypt;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: FileReader
 * author: zhaokl
 * creationTime: 2018-04-04 15:44:20
 * version: 1.0
 * desc: 读取文件
 * <p>
 **/

@Slf4j
public class FileReader {

	public String read(String fileName) {
		log.info("FileReader::read::parameters:{ " + "fileName = [" + fileName + "]" + "}");
		return fileName;
	}
}
