package singleton;

public class MyStack {
    private int[] storage;
    private int capacity;
    private int count;
    private static final int GROW_FACTOR = 2;

    public MyStack(){
        this.capacity = 8;
        this.storage = new int[8];
        this.count = 0;
    }

    public MyStack(int capacity){
        this.capacity = capacity;
        this.storage = new int[capacity];
        this.count = 0;
    }

    public void push(int value){
        storage[count++] = value;
    }

}
