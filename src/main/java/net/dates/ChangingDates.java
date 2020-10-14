package net.dates;

import java.time.LocalDate;
import java.time.Period;

public class ChangingDates {

    public static LocalDate process(LocalDate ld){
        System.out.println(ld.toString());
        // use this to change dates with no zone information
        LocalDate ld2 = ld.plus(Period.of(0,1,1));
        System.out.println(ld2.toString());
        return ld2;
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 1, 8);
        System.out.println(process(date));
    }

}
