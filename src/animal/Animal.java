package animal;

public abstract class Animal {

    protected int legs;

    protected Animal() {
        System.out.println("创建了一个没有腿的对象");
    }

    protected Animal(int legs){
        this.legs = legs;
        System.out.println("创建了一个有"+legs+"条腿的动物");
    }

    public abstract void eat();

    public void walk(){
        System.out.println("使用"+this.legs+"条腿走路");
    }
}
