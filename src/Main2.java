import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = s.nextInt();
        }
        int[] kids = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (height[i]<height[j]) {
                    kids[i] = j;
                    break;
                }
            }
            
        }
        System.out.println(Arrays.toString(kids));
    }
}
