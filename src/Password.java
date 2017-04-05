import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class Password {
    public static void main(String[] agrs) {

        Scanner in = new Scanner(System.in);
        System.out.println("단어를 입력하시고 엔터를 치시오.");
        String inputted = in.nextLine(); //단어 입력 받음

        String strup = inputted.toUpperCase(); // 첫글자를 대문자로
        String sliced = inputted.substring(0, 1); // 첫글자 s때기
        String sliced2 = inputted.substring(1);
        int strcount = (inputted.length() ^ 2); //글자수 제곱
        System.out.println("$$" + strup + sliced + sliced2 + strcount + "##");

    }
}