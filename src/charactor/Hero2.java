package charactor;

public class Hero2 {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public Hero2() {

    }

    public Hero2(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(Hero2 h) {
        h = new Hero2("teemo", 383);
        System.out.println(h.name);
    }

    public static void main(String[] args) {
        Hero2 teemo = new Hero2("提莫", 383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        teemo.revive(teemo);

        System.out.println(teemo.hp);

    }

}