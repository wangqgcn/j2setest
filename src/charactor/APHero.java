package charactor;

public class APHero extends Hero implements AP,Mortal{

    public APHero(String name) {
        super(name);
    }

    @Override
    public void attack() {
        magicAttack();
    }

    public APHero() {

    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die() {
        System.out.println("AP英雄死了");
    }
}
