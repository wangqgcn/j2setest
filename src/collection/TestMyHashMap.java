package collection;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyHashMap m = new MyHashMap();
        m.put(10,"aa");
        m.put(20,"bb");
        m.put(30,"cc");
        m.put(30,"dd");
        System.out.println(m);
    }
}
