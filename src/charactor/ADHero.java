package charactor;

public class ADHero extends Hero implements AD{

    @Override
    public void physicAttack() {
        System.out.println("静态物理攻击");
    }

}
