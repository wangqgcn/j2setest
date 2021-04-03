package charactor;

public class Support extends Hero implements Healer {
    int recovery;

    @Override
    public void heal() {
        System.out.println("治疗");
    }

    public void heal(Hero h) {
        h.hp += this.recovery;
    }

    public void heal(Hero h, int hp) {
        h.hp += hp;
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        Support support = new Support();
        hero.name = "teemo";
        hero.hp = 300;
        support.heal(hero, 34);
        System.out.println(hero.hp);
    }
}
