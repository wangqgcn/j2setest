package collection;

public class TestHash {
    public static void main(String[] args) {
        int h = 14241431;
        int length = 16;
        myHash(h,length);
    }

    private static int myHash(int h,int length){
        System.out.println(h%length);

        System.out.println(h&length-1);
        return h&length-1;
    }
}
