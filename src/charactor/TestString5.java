package charactor;

/**
 * 把最后一个two单词首字母大写
 */

public class TestString5 {
    public static void main(String[] args) {
        String sentence = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        String[] ss = sentence.split(" ");
        for (int i = ss.length-1; i > 0; i--) {
            if(!ss[i].equals("two"))
                continue;
            ss[i] = ss[i].replace('t','T');
            break;
        }
        StringBuilder sentence2 = new StringBuilder(ss[0]);
        for (int i = 1; i < ss.length; i++) {
            sentence2.append(" ").append(ss[i]);
        }
        System.out.println(sentence2);

    }
}
