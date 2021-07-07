package collection;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);
        list.add(3,"wong");
        System.out.println(list);
    }
}
