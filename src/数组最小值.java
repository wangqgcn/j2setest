public class 数组最小值 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        System.out.println("数组中的各个随机数为:");
        for (int each : a) {
            System.out.println(each);
        }
        int n = 100;
        for (int i = 0; i < 5; i++) {
            if (a[i] < n) {
                n = a[i];
            }
        }
        System.out.println("数组a的最小值是:" + n);

    }
}
