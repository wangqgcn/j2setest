import java.util.Arrays;

public class 二维数组paixu {
    public static void main(String[] args) {
        int[][] a = new int[5][8];
        //赋值，输出
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println("\n");
        //复制到一维数组
        int[] b = new int[40];
        for (int k = 0; k < 5; k++) {
            System.arraycopy(a[k], 0, b, 8 * k, 8);
        }
        //排序
        Arrays.sort(b);
        //复制回二维数组并输出
        for (int l = 0; l < 5; l++) {
            System.arraycopy(b, 8 * l, a[l], 0, 8);
            System.out.println(Arrays.toString(a[l]));
        }
    }
}
