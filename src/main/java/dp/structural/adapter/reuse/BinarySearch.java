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

		while (low <= high) {
			int middle = (low + high) / 2;
			if (array[middle] < key) {
				low = middle + 1;
			} else if (array[middle] > key) {
				high = middle - 1;
			} else {
				return middle;
			}
		}
		return -1;
	}
}
