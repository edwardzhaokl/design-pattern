package basic.no01;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-05 23:41:05
 * desc: parent clazz
 * <p>
 **/
@Slf4j
public class Parent {

    static Integer staticFieldInParent = 1;

    public static void staticMethodInParent() {
        log.info("Parent::staticMethodInParent::parameters:{ " + "i = [" + staticFieldInParent + "]" + "}");
    }

}
