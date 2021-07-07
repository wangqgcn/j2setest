package collection;

import java.util.HashMap;

/**
 * 手工实现一个HashSet
 */
public class MyHashSet {
    HashMap map;

    private static final Object PRESENT = new Object();

    public MyHashSet(){
        map = new HashMap();
    }

    public void add(Object o){
        map.put(o,PRESENT);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder('[');

        for(Object key:map.keySet()){
            sb.append(key+"]");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
