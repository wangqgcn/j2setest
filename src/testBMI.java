import java.util.Scanner;

public class testBMI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入身高(m):");
        float height = s.nextFloat();
        System.out.println("请输入体重(kg):");
        float weight = s.nextFloat();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("身体状态是：体重过轻");
        } else if (bmi >= 18.5 && bmi < 24) {
            System.out.println("身体状态是：正常范围");
        } else if (bmi >= 24 && bmi < 27) {
            System.out.println("身体状态是：体重过重");
        } else if (bmi >= 27 && bmi < 30) {
            System.out.println("身体状态是：轻度肥胖");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("身体状态是：中度肥胖");
        } else if (bmi > 35) {
            System.out.println("身体状态是：重度肥胖");
        }
    }
}
