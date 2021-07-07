package charactor;

public class Hero1 {
    String heroName;
    float heroHp;

    private Hero1() {
    }

    public static Hero1 instance;
// 懒汉式单例模式
    public static Hero1 getInstance(String heroName, float heroHp) {
        if (null == instance) {
            instance = new Hero1();
        }
        return instance;
    }
}
