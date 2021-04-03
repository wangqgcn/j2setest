package charactor;

public class Hero {
    public String name;
    public float hp;
    public float armor;
    public int moveSpeed;

    public Hero() {
    }

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }
    void die(){
        hp = 0;
    }
    static void battleWin(){
        System.out.println("battleWin");
    }

    static String copyright;

    void legendary() {
        System.out.println(name + "超神了");
    }

    float getHp() {
        return hp;
    }

    void recovery(float blood) {
        hp = hp + blood;
        System.out.println(name + "回血了" + blood);
    }

    public static void main(String[] args) {
        Hero teemo = new Hero("提莫", 400);
        Hero.copyright = "版权由Riot Games公司所有";
        teemo.legendary();
        System.out.println(teemo.getHp());
        teemo.recovery(50);
        System.out.println(teemo.getHp());
        System.out.println(Hero.copyright);
        teemo.copyright = "Blizzard Entertainment Enterprise";
        System.out.println(teemo.copyright);

        ADHero ad = new ADHero();
        Hero h = ad;
        AD adi = (AD) h;
    //    APHero ap = (APHero) adi;   报错

    }
}
