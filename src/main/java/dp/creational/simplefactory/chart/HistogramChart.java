package dp.creational.simplefactory.chart;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 22:56:04
 * desc: concrete product: histogram chart
 * <p>
 **/

@Slf4j
public class HistogramChart implements Chart {

    public HistogramChart() {
        log.info("创建柱状图...");
    }

    @Override
    public void display() {
        log.info("显示柱状图...");
    }

}
