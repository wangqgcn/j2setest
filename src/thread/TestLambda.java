package thread;

public class TestLambda {

    public static void main(String[] args) {

        ILove iLove = a -> System.out.println("I love -->" + a);
        iLove.love(2);
    }
}

interface ILove {
    void love(int a);
}
