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
public class ConcurrencyTest {

    static final long count = 100000000L;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }


    static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (int i = 0; i < count; ++i) {
                    a += 5;

                }
            }
        });

        thread.start();

        long b = 0;
        for (long i = 0; i < count; ++i) {
            b--;
        }

        long time = System.currentTimeMillis() - start;

        thread.join(100000);

        log.info("using time " + time + "ms," + "b = " + b);
    }


    static void  serial() {
        long start = System.currentTimeMillis();

        int a = 0;
        for (long i = 0; i < count; ++i) {
            a += 5;
        }

        long b = 0;
        for (long i = 0; i < count; ++i) {
            b--;
        }


        long time = System.currentTimeMillis() - start;

        log.info("using time " + time + "ms," + "b = " + b);

    }
}
