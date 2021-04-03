import java.util.Scanner;

/**
 * 阶乘
 */
public class Factorial {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int n = s.nextInt();
//        int i = 0;
//        int sum=1;
//        while (i<n){
//            sum*=(n-i);
//            i++;
//        }
//        System.out.println("阶乘是："+sum);

/**
 * 乞丐
 int money = 0;
 for (int i = 0; i < 10; i++) {
 money+=1<<i;
 }
 System.out.println(money);
 **/
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 | i % 5 == 0)
                continue;
            System.out.println(i);
        }
    }
}
