package datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class IntervalCheck {

    public static void main(String[] args) {

        Instant start = Instant.now();
//        someAlgorithm();
        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        long millis = duration.toMillis();
        System.out.println(millis);

        LocalDate ip = LocalDate.of(2017, 03, 10);
        LocalDate now = LocalDate.now();

/*        Period period = Period.between(ip, now);*/
//        period.getDays();

        Period period = ip.until(now);
        int days = period.getDays();
        int months = period.getMonths();

        LocalDate nextWed =
                now.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));

        LocalDate theDay = now.with(new DayAfterTomorrow());


        System.out.println(theDay);

        System.out.println(nextWed);

        System.out.printf("%d개월 %d일", months, days);
    }

/*
        Period PKH = Period.between(date1, date2);
        long month = pe.get(ChronoUnit.MONTHS);
*/

//        System.out.println(PKH);


    public static void someAlgorithm() {

        long acc = 0L;
        for (int i = 0; i < 1000000; i++) {
            acc += i;
        }
    }
}




