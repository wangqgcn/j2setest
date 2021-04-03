public class 小学数学题 {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                for (int k = 0; k < 15; k++) {
                    for (int l = 0; l < 15; l++) {
                        if (i + j == 8 && j + k == 10 && i + l == 14 && l - k == 6) {
                            System.out.printf("%d,%d,%d,%d", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
