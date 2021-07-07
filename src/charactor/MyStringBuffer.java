package charactor;

public class MyStringBuffer implements IStringBuffer {
    int capacity = 16;
    int length = 0;
    char[] value;

    public MyStringBuffer() {
        value = new char[capacity];
    }

    public MyStringBuffer(String str) {
        this();
        if (null == str)
            return;
        if (capacity < str.length()){
            capacity = value.length * 2;
            value = new char[capacity];
        }
        if (capacity>=str.length())
            System.arraycopy(str.toCharArray(),0,value,0,str.length());

        length = str.length();
    }

    @Override
    public void append(String str) {
        append(str);
    }

    @Override
    public void append(char c) {
        append(String.valueOf(c));
    }

    @Override
    public void insert(int pos, char b) {
        insert(pos,String.valueOf(b));
    }

    @Override
    public void insert(int pos, String b) {
        insert(pos,b);
    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {

    }

    @Override
    public void reverse () {
        for (int i = 0; i < length / 2; i++) {
            char temp = value[i];
            value[i] = value[length - i - 1];
            value[length - i - 1] = temp;
        }
    }

    @Override
    public int length () {
        return length;
    }

    @Override
    public String toString() {
        String str = new String(value);
        return str;
    }
}