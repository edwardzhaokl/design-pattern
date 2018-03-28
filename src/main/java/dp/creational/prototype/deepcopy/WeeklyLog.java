package dp.creational.prototype.deepcopy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * project: design-pattern
 * class: WeeklyLog
 * author: zhaokl
 * creationTime: 2018-03-27 21:58:32
 * version: 1.0
 * desc: 周报
 * <p>
 **/

@Data
@Slf4j
public class WeeklyLog implements Cloneable, Serializable {

	private String name;

	private Date date;

	private String content;

	private Attachment attachment;

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

	public WeeklyLog deepClone() throws IOException, ClassNotFoundException {

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(this);

		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		WeeklyLog log2 = (WeeklyLog) objectInputStream.readObject();

		return log2;
	}

}
