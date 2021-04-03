package property;

import charactor.Hero;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private static Object object;

    public String name;
    public int price;

    public Item() {
    }


    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void test() throws Exception {
        for (int i = 0; i < 100; i++) {

        }
        throw new RuntimeException("  ");
    }


    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }


    public static void main(String[] args) {
        Item xueping = new Item();
        xueping.name = "血瓶";
        xueping.price = 50;

        Item caoxie = new Item();
        caoxie.name = "草鞋";
        caoxie.price = 300;

        Hero hero = new Hero();

        Item changjian = new Item("长剑", 350);
        System.out.println(changjian.price);
        System.out.println("changjian.price = " + changjian.price);

        System.out.println(changjian.price);
        List<String> list = new ArrayList<>();
        for (String s : list) {
            System.out.println("s = " + s);
            System.out.printf("");
            System.out.println("Item.main");
            System.err.println(s);
        }

        for (int i = list.size() - 1; i >= 0; i--) {

        }
        Object o = new Object();
        if (o == null) {

        }
        if (o != null) {

        }
        if (o != null) {

        }
        boolean flag = true;
        if (flag) {

        }
        if (!flag) {

        }
        Object o1 = new Object();
        Object lock = new Object();
        synchronized (lock) {

        }


        String.format("hello %s", "world");


    }
}

