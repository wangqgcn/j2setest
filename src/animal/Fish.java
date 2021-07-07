package animal;

public class Fish extends Animal implements Pet{

    private String name;

    @Override
    public void walk() {
        System.out.println("鱼不能走路");
    }

    public Fish() {
    }

    @Override
    public void eat() {

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

    }
}
