package design.pattern.creational.simplefactory.app;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 23:00:11
 * desc: client
 * <p>
 **/

@Slf4j
public class Client {

    public static void main(String[] args) {

        Chart chart;

        String charType = XMLUtils.getChartType();
        chart = Factory.getChart(charType);

        chart.display();
    }
}
