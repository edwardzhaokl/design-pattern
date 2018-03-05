package basic.no01;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-05 23:41:05
 * desc: parent class
 * <p>
 **/
@Slf4j
public class Parent {

    static Integer staticFieldInClassA;

    public static void staticMethodInClassA(Integer i) {
        log.info("A::staticMethodInClassA::parameters:{ " + "i = [" + i + "]" + "}");
    }

}
