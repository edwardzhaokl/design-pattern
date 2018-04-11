package thread.producterconsumer;

/**
 * project: design-pattern
 * class: Consumer
 * author: zhaokl
 * creationTime: 2018-04-05 17:03:02
 * version: 1.0
 * desc: 消费者
 * <p>
 **/

public class Consumer {

	private Depot depot;

	public Consumer(Depot depot) {
		this.depot = depot;
	}

	public void consumer(final int val) {
		new Thread(() -> depot.consume(val)).start();
	}
}
