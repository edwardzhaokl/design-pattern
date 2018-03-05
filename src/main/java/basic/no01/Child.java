package basic.no01;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-05 23:45:08
 * desc: child class
 * <p>
 **/

@Slf4j
public class Child extends Parent {

    public void testStaticMethodInParent() {

    }


    public static void main(String[] args) {

        Child.staticMethodInParent();
    }
}
