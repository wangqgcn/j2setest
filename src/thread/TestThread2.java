package thread;

/**
 * 创建线程方法二：实现runnable接口,重写run方法，执行线程需要丢入runnable接口的实现类，调用start()方法
 */
public class TestThread2 implements Runnable{

    public static void main(String[] args) {

        TestThread2 testThread2 = new TestThread2();
        new Thread(testThread2).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码"+i);
        }
    }
}
