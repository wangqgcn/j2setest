package animal;

public class Test {
    public static void main(String[] args) {
        Spider s = new Spider();
        s.eat();
        s.walk();
        System.out.println(s.legs);

        Cat c = new Cat("喵喵");
        c.eat();
        c.walk();
        Cat c2 = new Cat();
        c2.setName("无名");
        System.out.println(c2.getName());
        c2.walk();

        Fish f = new Fish();
        f.setName("鱼鱼");
        f.walk();
        System.out.println(f.getName());
        f.play();
        f.eat();

    }
}
