package thread;

/**
 * 创建线程方法一：继承Thread类，重写run()方法，调用start()启动线程
 */
public class TestThread1 extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码"+i);
        }
    }

    public static void main(String[] args) {

        new TestThread1().start();

        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }
}
