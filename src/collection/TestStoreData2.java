package collection;

import java.util.*;

/**
 * 测试表格数据的存储
 */
public class TestStoreData2 {
    public static void main(String[] args) {
        User user1 = new User(1001,"张三",2000,"2018.5.5");
        User user2 = new User(1002,"李四",30000,"2018.5.5");
        User user3 = new User(1003,"王五",3000,"2018.5.5");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        for (User u :
                list) {
            System.out.println(u);
        }

        Map<Integer,User> map = new HashMap<>();
        map.put(user1.id,user1);
        map.put(user2.id,user2);
        map.put(user3.id,user3);

        Set<Integer> keyset = map.keySet();
        for (Integer key :
                keyset) {
            System.out.println(map.get(key));
        }
    }


    static class User{
        private int id;
        private String name;
        private double salary;
        private String date;

        //一个完整的javabean。要有set和get方法，和无参构造器
        public User() {
        }

        public User(int id, String name, double salary, String date) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.date = date;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", date='" + date + '\'' +
                    '}';
        }
    }
}
