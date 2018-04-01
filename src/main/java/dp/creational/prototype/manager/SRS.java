package dp.creational.prototype.manager;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * clazz: SRS
 * author: zhaokl
 * creationTime: 2018-03-28 21:57:16
 * version: 1.0
 * desc: 需求规格说明书
 * <p>
 **/

@Slf4j
@Data
public class SRS implements OfficialDocument {

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
		log.info("SRS::display::parameters:{}", toString());
	}
}
