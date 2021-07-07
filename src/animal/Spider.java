package animal;

public class Spider extends Animal{
    @Override
    public void eat() {
        System.out.println("蜘蛛正在吃东西");
    }

    public Spider() {
    }

    public Spider(int legs){
        super(legs);
        System.out.println("蜘蛛有"+legs+"条腿");
    }
}
