import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class alone {
    public static void main(String[] args) {
        String review =
                "동해물과 백두산이 마르고 " +
                        "닳도록 하느님이 ";

        List<String> myList = new ArrayList<String>(Arrays.asList(review.split("")));

        System.out.println(myList);


    }
}

