package collection;

import java.util.*;

public class TestStoreData {
    public static void main(String[] args) {

        Map<String,Object> row1 = new HashMap<>();
        row1.put("id",1001);
        row1.put("姓名","张三");
        row1.put("薪水",20000);
        row1.put("入职日期","2018.5.5");

        Map<String,Object> row2 = new HashMap<>();
        row2.put("id",1002);
        row2.put("姓名","李四");
        row2.put("薪水",30000);
        row2.put("入职日期","2018.4.4");

        Map<String,Object> row3 = new HashMap<>();
        row3.put("id",1003);
        row3.put("姓名","王五");
        row3.put("薪水",3000);
        row3.put("date","2020.5.5");

        List<Map<String,Object>> table1 = new ArrayList<>();
        table1.add(row1);
        table1.add(row2);
        table1.add(row3);

        for (Map<String, Object> row : table1) {
            Set<String> keySet = row.keySet();
            for(String key:keySet){
                System.out.print(key+":"+row.get(key)+"\t");
            }
            System.out.println();
        }
    }
}
