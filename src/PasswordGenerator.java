import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class PasswordGenerator {

    public static void main(String[] args){

        // input from keyboard
        Scanner in = new Scanner(System.in);

        System.out.println("단어를 하나 입력하세요:");
        String targetStr =in.nextLine();

        //second. processing
        String prefix = "$$";
        String postfix = "##";

//        String passwordGenerated = makePassword(targetStr,prefix,postfix);

        passwordGeneratorService service = new passwordGeneratorService();
        String passwordGenerated = service.makePassword(targetStr,prefix,postfix);


        // the last  output the result
        System.out.println(passwordGenerated);
    }

//    public static String makePassword(
//            String targetStr, String prefix, String postfix) {
//        int squareLengthofchar = targetStr.length()*targetStr.length();
//
//        targetStr =
//                targetStr.substring(0,1).toUpperCase()
//                + targetStr.substring(1);
//
//        String passwordGenerated = prefix+targetStr+squareLengthofchar+postfix;
//
//        return passwordGenerated;
//    }

}
