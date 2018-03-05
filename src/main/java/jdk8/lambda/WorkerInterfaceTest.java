package jdk8.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author zhaokl
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: TODO
 * @date ${date} ${time}
 */
@Slf4j
public class WorkerInterfaceTest{

	public static void execute(WorkerInterface workerInterface) {
		workerInterface.doSomeWork();
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		list.forEach(System.out::println);


		int sum = list.stream().map((x) -> x*x).reduce((x, y) -> x + y).get();

		log.info("" + sum);
		/*list.forEach((n) -> System.out.println(n));

		evaluate(list, (n) -> true);


		evaluate(list, (n) -> n%2 == 0);
*/


		/*new Thread(new Runnable(){

			@Override
			public void run(){
				log.info("12");
			}
		}).start();

		new Thread(() -> log.info("1234")).start();



		execute(new WorkerInterface(){

			@Override
			public void doSomeWork(){
				log.info("Worker invoke using anonymous class... ");

				System.out.println("Worker invoke using anonymous class... ");
			}
		});



		execute(() -> System.out.println("Worker invoke using lambda expression... "));


		execute(() -> log.info("Worker invoke using lambda expression... "));
*/	}

	public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
	    for (Integer n : list) {
	        if (predicate.test(n)) {
	            log.info(n + " ");
            }
        }
    }
}
