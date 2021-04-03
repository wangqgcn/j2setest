import java.util.Arrays;

public class 合并数组 {

    public static void main(String[] args) {
        int length1 = (int) (Math.random() * 5 + 5);
        int length2 = (int) (Math.random() * 5 + 5);
        int a[] = new int[length1];
        int b[] = new int[length2];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(b));

        int c[] = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        System.out.println(Arrays.toString(c));
    }
}
