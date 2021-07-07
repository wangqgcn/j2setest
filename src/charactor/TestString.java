package charactor;

/**
 * 使用循环穷举破解密码
 */

public class TestString {
    public static void main(String[] args) {
        char[] chars = new char[3];
        for (int i = 0; i < 3; i++) {
            char c = '@';
            while(!Character.isLetter(c)&&!Character.isDigit(c))
                c = (char) (Math.random()*122);
            chars[i] = c;
        }
        String str = new String(chars);
        System.out.println(str);
        char[] cc = new char[3];
        outloop:
        for (short i = '0'; i <= 'z'; i++) {
            for (short j = '0'; j <= 'z'; j++) {
                for (short k = '0'; k <= 'z'; k++) {
                    if(!Character.isLetterOrDigit(i)||!Character.isLetterOrDigit(j)||!Character.isLetterOrDigit(k))
                        continue;
                    cc[0] = (char) i;
                    cc[1] = (char) j;
                    cc[2] = (char) k;
                    String ss = new String(cc);
                    System.out.println(ss);
                    if(str.equals(ss)){
                        System.out.println("找到密码是:"+ss);
                        break outloop;
                    }
                }
            }
        }
    }
}
