import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class InterestCalculator {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("원금을 입력하세요");
        int deposit= in.nextInt();
        System.out.println("기간을 입력하세요");
        int term= in.nextInt();
        System.out.println("이율을 입력하세요");
        double InterestRate = in.nextDouble();

        //Input
        /*
        원금을 입력하세요 : 3000000
        기간을 입력하세요 : 48개월
        이율을 입력하세요 : 35.5
        */
        double Formula = deposit*InterestRate*(term/12);
        //Process
        //이자계산공식 : 이자 = 원금 x 이율(연이율) X(월/12)
        //기간 : 연

        System.out.println(term+ "개월 후 당신은" + Formula+"원을 받을수 있습니다");
        //Output
        /*
        48개월 후 당신은 5000000원을 받을수 있습니다.
         */
    }
    public static double calcInterst(
            int principle, int month, double rate){

        double interest =
                principle * (rate/100)* (month/12);
        return interest;

    }

}

