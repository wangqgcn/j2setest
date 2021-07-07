package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = "2000-12-31 23:59:59 999";
        Date[] dates = new Date[9];
        Date[] dates2 = new Date[9];
        long[] longs = new long[9];
        try {
            Date d = sdf.parse(str);
            long l = d.getTime();
            System.out.println("得到的随机数组是:");
            for (int i = 0; i < 9; i++) {
                longs[i] = (long) (Math.random()*l);
                System.out.println(sdf2.format(dates[i]));
            }
            Arrays.sort(longs);
            System.out.println("按从小到达排序是:");
            for (int i = 0; i < 9; i++) {
                dates2[i] = new Date(longs[i]);
                System.out.println(sdf2.format(dates2[i]));
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }




    }
}
