package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class HelloDate {
    public static void main(String[]args){

       long current =  System.currentTimeMillis();

       LocalDate d = LocalDate.now();
       System.out.println(d);

       LocalTime t = LocalTime.now();
       System.out.println(t);

        LocalDateTime a = LocalDateTime.now();
        System.out.println(a);

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        LocalDate bir = LocalDate.parse("2017-04-03");
        LocalDate A = bir.plus(50, ChronoUnit.DAYS);
        System.out.print(A);




    }
}
