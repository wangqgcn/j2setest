package collection;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("1001","gareen");
        map.put("1001","teemo");
        System.out.println(map.get("1001"));
    }
}
