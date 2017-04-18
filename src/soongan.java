/**
 * Created by danawacomputer on 2017-04-04.
 */
public class soongan {
    public static void main(String[]args){

        String myStr = "Soongon.kim";
        myStr.substring(0,myStr.indexOf("."));
        String sliced = myStr.substring(1,7);
        String sliced2 = myStr.substring(0,1);
        String myStr2 = "ay";
        String result = sliced+sliced2+myStr2;
        System.out.println(result);
    }
}
