package dp.structural.adapter.reuse;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: reuse
 * author: zhaokl
 * creationTime: 2018-04-01 19:43:55
 * version: 1.0
 * desc: 使用适配器重用算法库中的算法
 * <p>
 **/

@Slf4j
public class QuickSort {

	public int[] quickSort(int[] array) {
		log.info("array={}", array);
		sort(array, 0, array.length - 1);
		return array;
	}

	public void sort(int[] array, int low, int high) {
		if (low >= high) {
			return;
		}
		int p = partition(array, low, high);
		sort(array, low, p - 1);
		sort(array, p + 1, high);
	}

	// 划分 升序(逆序: v<a[++i] if i == low break;)
	public int partition(int[] a, int low, int high) {
		int v = a[low];
		int i = low;
		int j = high + 1;
		while (true) {
			while (a[++i] < v) if (i == high) break;
			while (a[--j] > v) if (j == low) break;
			if (i >= j) break;
			swap(a, i, j);
		}
		swap(a, low, j);
		return j;
	}


	public void swap(int[] a, int i, int j) {
		// 当 i==j 时, 有问题, 因为此时只有一个位置保存数据, 必须加判断
		if (i == j) {
			return;
		}

		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];

		log.info("array={}", a);
		// 同 a^=b^=a^=b
	}
}
