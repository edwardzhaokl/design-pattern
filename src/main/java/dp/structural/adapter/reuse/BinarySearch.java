package dp.structural.adapter.reuse;

/**
 * project: design-pattern
 * class: BinarySearch
 * author: zhaokl
 * creationTime: 2018-04-01 22:36:08
 * version: 1.0
 * desc: 二分查找
 * <p>
 **/

public class BinarySearch {

	public int binarySearch(int[] array, int key) {

		int low = 0;
		int high = array.length - 1;

		while (low < high) {
			int middle = (low + high) / 2;
			if (key > array[middle]) {
				low = middle;
			} else if (key < array[middle]) {
				high = middle;
			} else {
				return middle;
			}
		}
		return -1;
	}
}
