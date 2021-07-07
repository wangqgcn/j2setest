package charactor;

public abstract class Hero3 {

    abstract void attack();

    String name;
    float hp;

    public static void main(String[] args) {
        Hero3 h3 = new Hero3() {
            @Override
            void attack() {

            }
        };
        System.out.println(h3);
    }

}
