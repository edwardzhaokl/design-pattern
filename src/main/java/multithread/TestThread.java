package multithread;

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
public class TestThread extends Thread {

    TestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; ++i) {

            log.info(" " + super.getName() + ": " + i);
           /* try {
                sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
                log.error("error = {}", e);
            }*/
        }
    }

    public static void main(String[] args) {
        log.info("current thread name is: {}", Thread.currentThread().getName());

        Thread thread1 = new TestThread("A");
        Thread thread2 = new TestThread("B");


        thread1.start();
        thread1.start();

        log.info("current thread name is: {}", Thread.currentThread().getName());

    }

}
