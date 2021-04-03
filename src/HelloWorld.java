import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int[] a = new int[]{12, 41, 14, 142, 412, 214, 12, 421,};
        int[] b = Arrays.copyOfRange(a, 0, 5);
        System.out.println(Arrays.toString(a));
        int c = Arrays.binarySearch(a, 142);
        System.out.println(c);

    }
}
