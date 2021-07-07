package charactor;

/**
 * 把句子每个单词首字母转为大写
 */

public class TestString2 {
    public static void main(String[] args) {
        String sentence = "let there be light";
        String[] ss = sentence.split(" ");
        for (int i = 0; i < ss.length; i++) {
            char[] ch = ss[i].toCharArray();
            ch[0] = Character.toUpperCase(ch[0]);
            ss[i] = new String(ch);
        }
        StringBuilder sentence2 = new StringBuilder(ss[0]);
        for (int i = 1; i < ss.length; i++) {
            sentence2.append(" ").append(ss[i]);
        }
        System.out.println(sentence2);
    }
}
