package designpattern.creational.simplefactory.calculator;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-10 15:33:34
 * desc: factory
 * <p>
 **/

@Slf4j
public class Factory {

    public static Operation getOperation(char operator) {

        if ('+' == operator) {
            return new OperationAdd();
        }



        return null;
    }

}
