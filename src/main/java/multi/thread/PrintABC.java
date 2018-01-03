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
public class PrintABC implements Runnable {

    private String name;
    private final O pre;
    private final O self;

    PrintABC(String name, O pre, O self) {
        this.name = name;
        this.pre = pre;
        this.self = self;
    }


    @Override
    public void run() {
        int count = 10;

        while (count > 0) {
            synchronized (pre) {
                log.info("synchronized 已经获取了对象{}的锁", pre);
                synchronized (self) {
                    log.info("synchronized 已经获取了对象{}的锁", self);

                    log.info("{} : {}", count, name);
                    --count;

                    //log.info("持有对象{}的monitor的等待队列线程将被唤醒", self);
                    self.notify();

                }
                log.info("synchronized 已经释放了{}的锁", self);

                try {
                    //log.info("当前线程{}还持有对象{}的锁", Thread.currentThread(), pre);
                    //log.info("当前线程{}将释放对象{}的锁, 并进入等待队列", Thread.currentThread(), pre);
                    pre.wait();
                } catch (InterruptedException e) {
                    log.error("{}", e);
                }

            log.info("synchronized -将-释放对象{}的锁", pre);
            }

        }
    }


    public static void main(String[] args) throws Exception{
        O a = new O("a");
        O b = new O("b");
        O c = new O("c");

        PrintABC pa = new PrintABC("A", c, a);
        PrintABC pb = new PrintABC("B", a, b);
        PrintABC pc = new PrintABC("C", b, c);

        new Thread(pa).start();
        Thread.sleep(100);
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
    }
}

@Slf4j
class O {
    private String name;

    O(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}