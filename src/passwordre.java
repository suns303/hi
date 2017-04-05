import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class passwordre {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        System.out.println("단어하나를 입력하세요");
        String soonsung = in.nextLine();
        String prefix ="$$";
        String prepost ="##";
        int SquareLengchar = soonsung.length()*soonsung.length();

        soonsung = soonsung.substring(0,1).toUpperCase()+soonsung.substring(1);

        String password = prefix+soonsung+SquareLengchar+prepost;

        System.out.println(password);


    }
}

