package charactor;

import property.Item;

public abstract class Hero {
    public String name;
    public float hp;

    //抽象方法
    //子类必须实现抽象方法
    public abstract void attack();

    public Hero() {
    }

    public Hero(String name) {
        System.out.println("有参数的构造方法");
        this.name = name;
    }

    public void useItem(Item i){
        System.out.println("Hero use item");
        i.effect();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }

    public void finalize(){
        System.out.println("这个对象正在被回收");
    }

    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        Hero h = new Hero() {
            @Override
            public void attack() {

            }
        };
    }
}
