package net.dates;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates {

    public static void main(String[] args) {
        Dates dates = new Dates();

        java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1);
        System.out.println(dt);

//        LocalDateTime ldt = LocalDateTime.now();
//
//        try{
//            System.out.println(dates.getDateString(ldt));
//        }catch (DateTimeException dte){
////            dte.printStackTrace();
//            System.out.println("Fuck It!!!");
//        }


    }

    public String getDateString(LocalDateTime ldt){
        return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ldt);
    }
}
