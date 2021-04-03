/**
 * 百万富翁
 */

public class Millionaire {
    public static void main(String[] args) {

        int perYear = 12000;
        float rate = 0.20f;
        int sum = 0;
        int target = 1000000;
        outloop:
        for (int i = 1; i < 100; i++) {
            sum += (int) (perYear * Math.pow(1 + rate, i));
            System.out.println("经过" + i + "年，总收入达到:" + sum);
            if (sum > target) {
                System.out.println("一共需要" + i + "年，累计收入超过:" + target);
                break outloop;
            }
        }
    }
}
