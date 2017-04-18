package map;

import mapalone.model.park;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class ParkmapMain {
}

/*
    public static void  main(String[]args){
        //prepare for storing
        Map<String,park> map = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src\\parks.csv"));

            br.readLine();
            String line ="";
            while((line = br.readLine())!= null) {
                String[] spl = line.split(",");
                map.put(spl[0],new park(spl[1],spl[2],spl[3],spl[4],spl[5]));
            }

            System.out.println(map.size());
            park p = map.get("BAL07");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

*/
