/**
 * 递归
 */
public class TestRecursion {
    public static void main(String[] args) {
        System.out.println(f(4));
    }

    static int n= 10;
    static long f(int n){
        if(n==1)
            return 1;
        else {
            return n * f(n - 1);
        }
    }

    static void b(){
        System.out.println("b");
    }
}
