import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

public class 黄金分割点 {
    public static void main(String[] args) {
        double gold = 0.618f;
        double temp1 = 10;
        int a = 1;
        int b = 1;
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                if (0 == i % 2 && 0 == j % 2)
                    continue;
                if (Math.abs((double) i / j - gold) < Math.abs((double) a / b - gold)) {
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(a + "/" + b + "=" + (double) a / b);
    }
}
