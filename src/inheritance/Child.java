package inheritance;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Child extends parent {

    private String hobby;

    @Override

    public void smoke(){
        System.out.println("아들이 담배를핍니다");
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
