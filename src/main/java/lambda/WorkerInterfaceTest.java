package lambda;

import lombok.extern.slf4j.Slf4j;

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
		execute(new WorkerInterface(){

			@Override
			public void doSomeWork(){
				log.info("Worker invoke using anonymous class... ");

				System.out.println("Worker invoke using anonymous class... ");
			}
		});



		execute(() -> System.out.println("Worker invoke using lambda expression... "));


		execute(() -> log.info("Worker invoke using lambda expression... "));

	}
}
