package dp.creational.prototype.manager;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: FAR
 * author: zhaokl
 * creationTime: 2018-03-28 21:54:17
 * version: 1.0
 * desc: 可行性分析报告
 * <p>
 **/

@Slf4j
@Data
public class FAR implements OfficialDocument {

	@Override
	public OfficialDocument clone() {

		try {
			Object o = super.clone();

			return (OfficialDocument) o;
		}
		catch (CloneNotSupportedException e) {
			log.error("error={}", e);
		}

		return null;
	}

	@Override
	public void display() {
		log.info("FAR::display::parameters:{}", toString());
	}
}
