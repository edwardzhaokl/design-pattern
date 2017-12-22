package multi.thread;

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
public class TestRunnable{

    public static void main(String[] args) {
        DemoRunnable dr = new DemoRunnable();

        Thread t1 = new Thread(dr);
        Thread t2 = new Thread(dr);
        Thread t3 = new Thread(dr);
        Thread t4 = new Thread(dr);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }





}

@Slf4j
class DemoRunnable implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                log.info(Thread.currentThread().getName() + "--售票: " + ticket--);
            }
        }
    }
}