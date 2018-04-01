package dp.structural.adapter.reuse;

/**
 * project: design-pattern
 * class: OperatorAdapter
 * author: zhaokl
 * creationTime: 2018-04-01 23:10:16
 * version: 1.0
 * desc: 适配器类
 * <p>
 **/

public class OperatorAdapter implements ScoreOperation {

	private QuickSort quickSort;
	private BinarySearch binarySearch;

	public OperatorAdapter() {
		this.quickSort = new QuickSort();
		this.binarySearch = new BinarySearch();
	}


	@Override
	public int[] sort(int[] array) {
		return quickSort.quickSort(array);
	}

	@Override
	public int search(int[] array, int key) {
		return binarySearch.binarySearch(array, key);
	}

}
