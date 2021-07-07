package charactor;

/**
 * 统计有多少个以p字母开头的单词
 */

public class TestString3 {
    public static void main(String[] args) {
        String sentence = "peter piper picked a peck of pickled peppers";
        String[] ss = sentence.split(" ");
        int count = 0;
        for (String s :
                ss) {
            if(s.charAt(0)=='p')
                count++;
        }
        System.out.println(count);
    }
}
