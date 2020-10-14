package net.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datey {
    public static String getDateString(LocalDateTime ldt){
        return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ldt);
    }
    public float parseFloat( String s ){
        float f = 0.0f;      // 1
        try{
            f = Float.valueOf( s ).floatValue();    // 2
            return f ;      // 3
        }
        catch(NumberFormatException nfe){
            f = Float.NaN ;    // 4
            return f;     // 5
        }
        finally {
            return f;     // 6
        }
//        return f ;    // 7
    }

    public static void main(String[] args) {
//        System.out.println(getDateString(LocalDateTime.now()));
        LocalDateTime dt = LocalDateTime.parse("2015-01-02T17:13:50");
        System.out.println(dt.format(java.time.format.DateTimeFormatter.ISO_DATE_TIME));

        int a = 5, b = 7, k = 0;
        Integer m = null;

        k = new Integer(a) + new Integer(b);  //1
        System.out.println(k);
        k = new Integer(a) + b; //2
        System.out.println(k);
        k = a + new Integer(b);
        System.out.println(k);//3
        m = new Integer(a) + new Integer(b); //4
        System.out.println(m);
    }
}
