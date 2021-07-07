package charactor;

/**
 * 把 lengendary 改成间隔大写小写模式
 */

public class TestString4 {
    public static void main(String[] args) {
        String str = "lengendary";
        char[] ch = str.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            if(i%2!=0)
//                continue;
//            ch[i] = Character.toUpperCase(ch[i]);
//        }
//        str = new String(ch);
//        System.out.println(str);
        ch[ch.length-1] = Character.toUpperCase(ch[ch.length-1]);
        str = new String(ch);
        System.out.println(str);
    }
}
