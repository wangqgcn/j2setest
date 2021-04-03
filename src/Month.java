import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = s.nextInt();
        switch (month) {
            case 1:
                System.out.println("春季");
            case 2:
                System.out.println("春季");
            case 3:
                System.out.println("春季");
            case 4:
                System.out.println("夏季");
            case 5:
                System.out.println("夏季");
            case 6:
                System.out.println("夏季");
            case 7:
                System.out.println("秋季");
            case 8:
                System.out.println("秋季");
            case 9:
                System.out.println("秋季");
            case 10:
                System.out.println("冬季");
            case 11:
                System.out.println("冬季");
            case 12:
                System.out.println("冬季");
            default:
                System.out.println("这是啥？");
        }

    }
}
