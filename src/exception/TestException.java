package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
    public static void main(String[] args) throws IOException {
        read();
    }

    public static void read() throws IOException {
        FileReader reader = null;
        reader = new FileReader("d/a.txt");
        char c = (char) reader.read();
        reader.close();
    }



}
