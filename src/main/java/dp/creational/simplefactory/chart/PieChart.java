package dp.creational.simplefactory.chart;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 22:53:57
 * desc: concrete product: pie chart
 * <p>
 **/

@Slf4j
public class PieChart implements Chart {

    public PieChart() {
        log.info("创建饼图...");
    }

    @Override
    public void display() {
        log.info("显示饼图");
    }
}
