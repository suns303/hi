import java.awt.*;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class ArrayExample {
    public static void main(String[]args) {

//        int[] iArr = new int[10];
//        iArr[0] = 2;
//        iArr[1] = 4;
//        iArr[2] = 6;
//        iArr[3] = 8;
//        iArr[4] = 10;
//        iArr[5] = 12;
//        iArr[6] = 14;
//        iArr[7] = 16;
//        iArr[8] = 18;
//        iArr[9] = 20;
//        iArr[4] = 35000;

//        System.out.println(iArr[0]);
//        System.out.println(iArr[1]);
//        System.out.println(iArr[2]);
//        System.out.println(iArr[3]);
//        System.out.println(iArr[4]);
//        System.out.println(iArr[5]);

//        int[] iArr = {2,4,6,8,10,12,14,16,18,20};
//
//        for (int e:iArr) {
//            if(e % 5 == 0) {
//                System.out.println("빙고");
//            } else{
//                System.out.println(e);
//            }
//
        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
                , 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
//        for (int e : iArr) {
//            String converted = String.valueOf(e);
//
//            if (converted.contains("3") || converted.contains("6") ||
//                    converted.contains("9")) {
//            } else {
//
//                System.out.println(converted);
//            }
//        }
          int sum = 0;
          int count =0;
          double arrange = 0.0;
          for(int e : iArr) {
              sum += e;
              arrange = count / e;
          }
          System.out.println(arrange);



    }
        }


