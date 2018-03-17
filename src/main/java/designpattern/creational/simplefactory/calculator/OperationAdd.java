package designpattern.creational.simplefactory.calculator;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-10 15:29:17
 * desc: concrete product: 加法
 * <p>
 **/

@Slf4j
public class OperationAdd extends Operation{

    /*OperationAdd(Double operand1, Double operand2) {
        super.operand1 = operand1;
        super.operand2 = operand2;
    }*/

    @Override
    Double calculate(Double operand1, Double operand2) {
        return operand1 + operand2;
    }


}
