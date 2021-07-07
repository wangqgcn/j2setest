package animal;

public class Cat extends Animal implements Pet{
    String name;
    //有参构造方法
    public Cat(String name){
        super(4);
        this.name = name;
    }
    //无参构造方法
    public  Cat(){
        this(" ");
        System.out.println("没有名字的猫");
    }
    @Override
    public void eat() {
        System.out.println(this.name+"在吃东西");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(this.name+"在陪你玩");
    }
}
