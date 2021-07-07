package collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestList {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();
        c.add("lixiang");
        System.out.println(c.hashCode());
        int n = c.indexOf("lixiang");
        System.out.println(n);
    }
}
