package dp.structural.facade.encrypt;

/**
 * project: design-pattern
 * class: EncryptFacade
 * author: zhaokl
 * creationTime: 2018-04-04 15:51:33
 * version: 1.0
 * desc: 外观类
 * <p>
 **/

public class EncryptFacade {

	private FileReader fileReader = new FileReader();
	private CipherMachine cipherMachine = new CipherMachine();
	private FileWriter fileWriter = new FileWriter();

	public void fileEncrypt(String fileName, String fileNameAfter) {
		String plainText = fileReader.read(fileName);
		String encryptText = cipherMachine.encrypt(plainText);
		fileWriter.write(encryptText, fileNameAfter);
	}
}
