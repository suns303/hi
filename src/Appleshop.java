import java.text.DecimalFormat;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class Appleshop {

    public static void main(String[]args){
        int ipadpro = 999_000;
        double dcRate = ipadpro*0.85;
        DecimalFormat commain = new DecimalFormat("#,##0.00");

                System.out.println("할인된가격은" + commain.format(dcRate)+"원입니다" );
    }
}
