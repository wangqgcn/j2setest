package charactor;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("let there ");
        sb.append("be light");
        System.out.println(sb);
        sb.delete(4,10);
        System.out.println(sb);
        sb.insert(4,"there ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("the");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
    }
}
