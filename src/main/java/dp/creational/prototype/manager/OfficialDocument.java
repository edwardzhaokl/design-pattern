package dp.creational.prototype.manager;

import java.io.Serializable;

/**
 * @project: design-pattern
 * @description: 抽象公文接口
 * @author: zhaokl
 * @createTime: 2018-03-28 21:24
 **/

public interface OfficialDocument extends Cloneable {

	OfficialDocument clone();
	void display();
}
