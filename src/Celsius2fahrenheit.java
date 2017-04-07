/**
 * Created by danawacomputer on 2017-04-04.
 */
public class Celsius2fahrenheit {
    public static void main(String[] args) {
        int celcius =19;
        Celcious2FahrenheitService service = new Celcious2FahrenheitService();
        double result = service.toFaranheit(celcius);

        String str = new String("Hello");
        //String str = "hello";
        System.out.println(result);
    }

    public static double toFaranheit(int celcius) {
        return (celcius * 1.8) + 32;
    }
}
//
//
//}
//


