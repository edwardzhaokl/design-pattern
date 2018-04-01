package dp.structural.adapter.reuse;

/**
 * @project: design-pattern
 * @description: 目标接口: 抽象成绩操作类
 * @author: zhaokl
 * @createTime: 2018-04-01 23:03
 **/

public interface ScoreOperation {

	public int[] sort(int[] array);

	public int search(int[] array, int key);
}
