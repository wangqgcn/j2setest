package collection;

import java.util.Arrays;

public class MyHashMap {

    Node2[] table;   //位桶数组。bucket array
    int size;        //存放的键值对的个数

    public MyHashMap(){
        table = new Node2[16];
    }

    public void put(Object key,Object value){
        Node2 newNode = new Node2();
        newNode.hash = myHash(key.hashCode(),table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node2 temp = table[newNode.hash];
        Node2 iterLast = null;
        boolean keyRepeat = false;

        if(temp==null)
            table[newNode.hash] = newNode;
        else {
            //此处数组元素不为空，则遍历对应链表
            while(temp!=null){
                //如果key重复，覆盖
                if(temp.key.equals(key)){
                    keyRepeat = true;
                    System.out.println("key重复了");
                    temp.value = value;
                    break;
                }
                   // key不重复
                else{
                    iterLast = temp;
                    temp = temp.next;
                }
            }
        }
        if(!keyRepeat){
            iterLast.next = newNode;
        }
    }

    public int myHash(int v,int length){
        return v&(length-1);
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "table=" + Arrays.toString(table) +
                ", size=" + size +
                '}';
    }
}
