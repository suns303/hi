/**
 * Created by danawacomputer on 2017-04-06.
 */
public class Appleshopfuction {
    public static void main(String[]args) {
        int ipadpro = 999_000;
        double dcRate = ipadpro * 0.85;
        double discountedPrice = getDiscountedPrice(ipadpro, dcRate);//두개를 받아서 하나를 출력

        System.out.println(discountedPrice + "원");
    }
    public static double getDiscountedPrice(int ipadpro, double dcRate){
        double discountedPrice = ipadpro*(1-dcRate/100);
        return discountedPrice;





    }
}

