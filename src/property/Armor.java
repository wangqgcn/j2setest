package property;

public class Armor extends Item {
    int ac;

    public Armor() {
    }

    public Armor(String name, int price, int ac) {
        super(name, price);
        this.ac = ac;
    }

    public static void main(String[] args) {
        Armor bujia = new Armor();
        bujia.name = "布甲";
        bujia.price = 300;
        bujia.ac = 15;

        Armor suozijia = new Armor("锁子甲", 500, 40);

    }
}
