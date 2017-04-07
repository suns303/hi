package gourmet;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetService {

    public double calcAverScore(List<Gourmet> gourmetList) {


        int sum = 0;
        for (Gourmet e : gourmetList) {
            sum += e.score;
        }
        double average = (double) sum / gourmetList.size();
        return average;

    }


}
