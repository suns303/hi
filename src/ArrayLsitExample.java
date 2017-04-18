import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayLsitExample {

    public static void main(String[] args) {

        String review =
                "낙지한마리"+
                        "수제비" +
                        "약간" +
                        "톡쏘는듯한매운맛과 시원한" +
                        " 국물을 모두 맛볼 수 있어요";

        List<String> myList = new ArrayList<String>(Arrays.asList(review.split(" ")));

        System.out.println(myList);

        //1. review 스트링을 리스트로 변환
        //공백을 기준으로 분리(공백을 딜리미터로 분리)

        //1-1 스트링을 분해해서 스트링의 배열로 만든다.

        //2. 리스트를 순회해서 전체 단어의 글자수의 평균을 구한다.
        int charCount = 0;
        int wordcount = 0;
        double average = 0;

        for (String e : myList) {
            charCount += e.length();
            wordcount++;
        }
        average = charCount / (double) wordcount;
        System.out.println(average);

        //3. 단어가 5자 이하인 새로운 리스트를 생성한다.

        List<String> fiveword = new ArrayList<>();
        for (String e : myList) {
            if (e.length() <= 5) {
                fiveword.add(e);
            }
            System.out.println(e);
        }


    }
}

