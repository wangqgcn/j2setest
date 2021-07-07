package property;

import java.util.ArrayList;
import java.util.List;

public class Item {
    public String name;
    public int price;



    public Item() {
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public void buy(){
        System.out.println("购买");
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
    }
}

