package dp.creational.simplefactory.calculator;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-07 14:53:09
 * desc: abstract product
 * <p>
 **/

@Slf4j
public abstract class Operation {


    abstract Double calculate(Double operand1, Double operand2);

}
