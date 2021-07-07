package charactor;

import java.util.Scanner;

public class TestChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar) || Character.isDigit(aChar))
                System.out.print(aChar);
        }
    }
}
