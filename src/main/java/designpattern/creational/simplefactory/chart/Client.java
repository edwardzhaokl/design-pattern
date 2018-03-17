package designpattern.creational.simplefactory.chart;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * project: design-pattern
 * author: zhaokl
 * createdTime: 2018-03-06 23:00:11
 * desc: client
 * <p>
 **/

@Slf4j
public class Client {

    @Test
    public void client1() {

        Chart chart;

        chart = Factory.getChart("pie");

        chart.display();
    }


    @Test
    public void client2() {

        Chart chart;

        String charType = XMLUtils.getChartType();
        chart = Factory.getChart(charType);

        chart.display();
    }
}
