import java.time.LocalDate;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class AnniversaryCalculator {

    public static void main(String[]args){

        LocalDate baseDate = LocalDate.of(2017,4,3);

        LocalDate fifty = baseDate.plusDays(49);
        LocalDate oneHundred = baseDate.plusDays(99);
        LocalDate twoHundred = baseDate.plusDays(199);
        LocalDate oneThousand = baseDate.plusDays(1000);

        if(fifty.compareTo(oneHundred) > 0 ) {
            System.out.println("fifty가 더 커요");
        } else {
            System.out.println("oneHundred가 더 커요");
        }

       if(fifty.isAfter(oneHundred)){
           System.out.println("fifty가 더 커요");
       } else {
           System.out.println("oneHundred가 더 커요");
       }




        LocalDate bb = baseDate.plusDays(49).minusYears(3).plusMonths(3);

        System.out.println(bb);

        System.out.println(fifty);
        System.out.println(oneHundred);
        System.out.println(twoHundred);
        System.out.println(oneThousand);


    }
}
