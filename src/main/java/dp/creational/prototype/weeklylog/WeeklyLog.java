package dp.creational.prototype.weeklylog;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * project: design-pattern
 * clazz: WeeklyLog
 * author: zhaokl
 * creationTime: 2018-03-27 21:58:32
 * version: 1.0
 * desc: 周报
 * <p>
 **/

@Data
@Slf4j
public class WeeklyLog implements Cloneable {

	private String name;

	private Date date;

	private String content;

	public WeeklyLog clone() {
		try {
			Object object = super.clone();
			return (WeeklyLog) object;
		}
		catch (CloneNotSupportedException e) {
			log.error("error = {}", e);
		}
		return null;
	}

}
