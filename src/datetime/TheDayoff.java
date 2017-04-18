package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class TheDayoff implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        //1. 계산을 위한 기준날짜
        LocalDate theDay = LocalDate.from(temporal);
        //2. 둘째 넷째 일요일을 구한다.
        LocalDate secondSunday = theDay.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
        LocalDate fourthSunday =
                theDay.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.SUNDAY));

        if (theDay.isBefore(secondSunday)) {
            return secondSunday;
        } else if(theDay.isBefore(fourthSunday)){
            return fourthSunday;
        } else{
            return theDay.plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.SUNDAY));
        }
    }
}

//        //2. 기준날짜의 달의 첫째날을 구한다.
//        LocalDate firstDayOfMonth =
//                theDay.with(TemporalAdjusters.firstDayOfMonth());
//
//        //3. 두번째 일요일
//        LocalDate secondSunday =
//                firstDayOfMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY))
//                        .with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
//        //4. 넷째 일요일
//        LocalDate fourthSunday =
//                secondSunday.with(TemporalAdjusters.next(DayOfWeek.SUNDAY))
//                        .with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
//
//        //5. 기준일이 둘째 일요일 이전이면 둘째일이욜 리턴하고 아니면 넷째 일요일 리턴
//        if (theDay.isBefore(secondSunday)) {
//            return secondSunday;
//        } else {
//            return fourthSunday;








