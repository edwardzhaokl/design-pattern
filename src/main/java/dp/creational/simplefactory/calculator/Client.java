package dp.creational.simplefactory.calculator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-10 15:37:26
 * desc:
 * <p>
 **/

@Slf4j
public class Client {

    @Test
    public void test1() {

        char operator = '+';
        Operation o = Factory.getOperation(operator);


        log.info("Client::test1::parameters:{ " + "" + "}, result={}", o.calculate(1.0, 2.0));
    }
}
