package oop;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class classMemberExample {

    public static int CLASS_MEMBER = 5;

    private int number;
    private String aString;

    public static int getStaticTest(){
        return 15;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }
}
