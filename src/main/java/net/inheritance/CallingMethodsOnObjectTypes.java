package net.inheritance;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class CallingMethodsOnObjectTypes {
}

class Automobile{
    public void drive() {  System.out.println("Automobile: drive");   }
}

 class Truck extends Automobile{
    public void drive() {  System.out.println("Truck: drive");   }
    public static void main (String args [ ]){
//        Automobile  a = new Automobile();
//        Truck t  = new Truck();
//        a.drive(); //1
//        t.drive(); //2
//        a = t;     //3
//        a.drive(); //4

        System.out.println(LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_DATE_TIME));

    }
}
