package charactor;

import property.Item;

public class ADHero extends Hero implements AD,Mortal{

    @Override
    public void attack() {
        physicAttack();
    }

    public ADHero(String name){
        super(name);
        System.out.println("AD Hero的构造方法");

    }

    @Override
    public void physicAttack() {
        System.out.println("静态物理攻击");
    }

    @Override
    public void die() {
        System.out.println(this.name+"死了");
    }

    @Override
    public void useItem(Item i) {
        System.out.println("子类ADHero调用Hero的userItem方法");
        super.useItem(i);
    }

    public static void battleWin(){
        System.out.println("ADHero batter win");
    }

    public static void main(String[] args) {
        ADHero h = new ADHero("德莱文");
        h.battleWin();
    }
}
