package singleton;

public class TestSingleton {
    private TestSingleton(){
    }

    private static TestSingleton instance;

    public static TestSingleton getInstance(){
        if(instance==null){
            instance = new TestSingleton();
        }
        return instance;
    }

}
