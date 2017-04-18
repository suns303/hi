import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ConvStore {
    public static void main(String[] args) {

        //input
        Scanner in = new Scanner(System.in);
        System.out.print("담배 종류를 입력하세요(1.디스 2.말보로): ");
        int kindTobacco = in.nextInt();
        System.out.print("나이를 입력하세요: ");
        int age = in.nextInt();
        System.out.print("수량을 입력하세요: ");
        int num = in.nextInt();

        //processing
        double tobacco = 0; //초기화하는 것을 권장함
        String nameOftobacco;

        if(kindTobacco == 1) {
            tobacco = 4500;
            nameOftobacco = "This";
        }
        else {
            tobacco = 5200;
            nameOftobacco = "Malboro";
        }

        // 담배 종류에 따른 가격 선언

        if(age < 19) {
            tobacco = 0.8 * tobacco * num;
            System.out.println("19세 미만 30% 할인가입니다.");
        }
        else if(age >= 45) {
            tobacco = 1.3 * tobacco * num;
            System.out.println("45세 이상 30% 추가금 포함 가격입니다.");
        }
        else
            tobacco *= num;
        //나이에 따른 할인률

        //output
        System.out.println("구매하신 담배 " + nameOftobacco + " " + num + "개의 가격은 " + tobacco + "원 입니다.");

    }
}

