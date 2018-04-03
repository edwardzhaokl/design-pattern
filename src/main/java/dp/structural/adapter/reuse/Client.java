package dp.structural.adapter.reuse;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * class: Client
 * author: zhaokl
 * creationTime: 2018-04-01 23:15:47
 * version: 1.0
 * desc: 测试
 * <p>
 **/

@Slf4j
public class Client {

	@Test
	public void test() {
		ScoreOperation operation = new OperatorAdapter();
		int scores[] = {84, 76, 50, 69, 90, 91, 88, 96};
		int[] result = operation.sort(scores);

		log.info("result={}", result);

		int score = operation.search(result, 96);
		log.info("score={}", score);
	}

}
