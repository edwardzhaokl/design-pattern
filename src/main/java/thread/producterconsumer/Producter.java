package thread.producterconsumer;

/**
 * project: design-pattern
 * class: Producter
 * author: zhaokl
 * creationTime: 2018-04-05 17:06:43
 * version: 1.0
 * desc: 生产者
 * <p>
 **/

public class Producter {

	private Depot depot;

	public Producter(Depot depot) {
		this.depot = depot;
	}

	public void product(final int val) {
		new Thread(() -> depot.produce(val)).start();
	}
}
