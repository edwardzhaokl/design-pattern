package thread.producterconsumer;

import lombok.Data;

/**
 * project: design-pattern
 * class: Depot
 * author: zhaokl
 * creationTime: 2018-04-05 16:51:48
 * version: 1.0
 * desc: 仓库
 * <p>
 **/

@Data
public class Depot {

	// 仓库容量
	private int capacity;

	// 实际库存
	private int size;

	public Depot(int capacity) {
		this.capacity = capacity;
		this.size = 0;
	}


	public synchronized void produce(int val) {
		try {
			int left = val;
			while (left > 0) {
				while (size >= capacity) {
					wait();
				}

				int inc = size + left > capacity ? capacity - size : left;
				size += inc;
				left -= inc;
				System.out.printf("%s produce(%3d) --> left=%3d, inc=%3d, size=%3d\n",
								  Thread.currentThread().getName(), val, left, inc, size);
				// 通知“消费者”可以消费了
				notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}

	public synchronized void consume(int val) {
		try {
			int left = val;
			while (left > 0) {
				while (size <= 0) {
					wait();
				}

				int desc = left < size ? left : size;

				size -= desc;
				left -= desc;

				notifyAll();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}


}
