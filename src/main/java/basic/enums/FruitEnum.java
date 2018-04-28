package basic.enums;

/**
 * project: design-pattern
 * author: zhaokl
 * creationTime: 2018-04-14 20:47:43
 * desc: 测试
 * <p>
 **/

public enum FruitEnum {

	APPLE(1,"apple"),
	BANANA(2, "banana");

	private int code;
	private String message;

	FruitEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
