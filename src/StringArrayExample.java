/**
 * Created by danawacomputer on 2017-04-05.
 */
public class StringArrayExample {
        public static void main(String[]args) {

            String[] stArr = {
                    "숟가락", "스시메이진", "맛찬들", "최우영스시", "용호낙지", "은행골", "메이지",
                    "돌배기집", "구로곱창", "두끼", "아비꼬", "킹콩부대찌개"
            };//첫번쨰 글자수 평균구하기, 글자수 3글자 이하인 엘레먼트의 배열 만들기

            int charCount = 0;

            for (String e : stArr) {
                charCount += e.length();
            }
            System.out.println((double) charCount / stArr.length);


            //2. 글자수가 3글자 이하인 엘레멘트 배열
            String[] resultArr = new String[stArr.length];
            int count = 0;
            for (String e : stArr) {
                if (e.length() <= 3) {
                    resultArr[count] = e;
                    count++;
                }
            }
            for (String e : stArr) {
                System.out.println(e);
            }

        }
}

