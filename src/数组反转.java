import java.util.Arrays;

public class 数组反转 {
    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        a[5] = (int) (Math.random() * 100);
        System.out.println("数组中的各个随机数为:" + Arrays.toString(a));
        int temp;
        for (int i = 0; i < (a.length + 1) / 2; i++) {
            temp = a[a.length - i - 1];
            a[a.length - i - 1] = a[i];
            a[i] = temp;
        }
        System.out.print("each" + Arrays.toString(a));
    }
}
