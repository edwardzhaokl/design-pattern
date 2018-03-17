package design.pattern.creational.simplefactory.chart;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 22:57:07
 * desc: factory class
 * <p>
 **/

@Slf4j
public class Factory {

    public static Chart getChart(String type) {
        Chart chart = null;

        if ("pie".equals(type)) {
            chart = new PieChart();
            log.info("初始设置化饼图...");
        } else if ("histogram".equals(type)) {
            chart = new HistogramChart();
            log.info("初始化设置柱状图");
        }

        return chart;
    }
}
