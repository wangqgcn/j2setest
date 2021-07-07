package charactor;

public class ADAPHero extends Hero implements AD,AP,Mortal{
    @Override
    public void physicAttack() {

    }

    @Override
    public void magicAttack() {

    }

    @Override
    public void die() {
        System.out.println("ADAP英雄死了");
    }

    @Override
    public void attack() {

    }
}
