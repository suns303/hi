package majorleague;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class majorservice {

    public int sumOfNotUS(List<park> list){
        int count=0;
        String checkUs = "US";

        for(park e : list){
            if( !(e.getCountry().equals(checkUs))){
                count++;
            }
        }
        return  count;
    }
    public int sumOfAlias(List<park> list){
        int count =0;

        for (park e : list){
            if(!(e.getParkAlias().equals("")))
                count++;
        }
        return count;
    }
    public double avarOfNamechar(List<park>list){
        int sum=0;

        for(park e :list){
            sum += e.getParkName().length();
        }

        double aver = (double) sum/list.size();
        return  aver;

    }

}
