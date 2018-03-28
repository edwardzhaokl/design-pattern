package dp.creational.builder.actor;

import lombok.Data;

/**
 * project: design-pattern
 * class: Actor
 * author: zhaokl
 * creationTime: 2018-03-18 16:07:18
 * version: 1.0
 * desc: Product角色: 复杂产品
 * <p>
 **/

@Data
public class Actor {

	// 角色类型
	private String type;

	// 性别
	private String sex;

	// 脸型
	private String face;

	// 服饰
	private String costume;

	// 发型
	private String hairstyle;
}
