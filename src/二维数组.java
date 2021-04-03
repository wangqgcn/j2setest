import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Arrays;

public class 二维数组 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

        int max = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("找出来最大的值是：" + a[x][y]);
        System.out.println(x + "," + y);
    }
}
