package singleton;

/**
 * 测试饿汉式单例模式
 */
public class SingletonDemo1 {
    private SingletonDemo1() {
    }

    private static SingletonDemo1 instance = new SingletonDemo1();

    public static SingletonDemo1 getInstance() {
        return instance;
    }
}
