package charactor;

/**
 * 创建一个长度是100的字符串数组
 * 使用长度是2的随机字符填充该字符串数组
 * 统计这个字符串数组里重复的字符串有多少种
 */
public class TestString6 {
    public static void main(String[] args) {
        String[] str = new String[100];
        char[] ch = new char[2];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                char c = '@';
                while (!Character.isLetterOrDigit(c))
                    c = (char)(Math.random()*122);
                ch[j] = c;
            }
            str[i] = new String(ch);
        }
        for (int i = 0; i < 100; i++) {
            if(i%20!=0) {
                System.out.print(str[i]+"\t");
            }
            if(i!=0&&i%20==0)
                System.out.println();
        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            String s = str[i];
            str[i] = null;
            for (int j = 0; j < 100; j++) {
                if(s.equals(str[j]))
                    sb.append(s).append(" ");
            }
        }
        System.out.format("总共有%d种重复的字符串",sb.length()/3);
        System.out.println("分别是:");
        System.out.println(sb);
    }
}
