package singleton;

/**
 * 测试懒汉式单例模式
 */
public class SingletonDemo2 {
    private SingletonDemo2() {
    }

    private static SingletonDemo2 instance;

    public static synchronized SingletonDemo2 getInstance() {
        if (null == instance) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
