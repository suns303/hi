/**
 * Created by danawacomputer on 2017-04-06.
 */
public class array {

    public static void  main(String[]args){
        int[] iArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        //accumulate
       int sum =0;

        for (int e: iArr){
          sum += e;    //  sum = sum*e;
        }
        int countofAraay = iArr.length;

        System.out.println(sum/(double)countofAraay);
    }
}

