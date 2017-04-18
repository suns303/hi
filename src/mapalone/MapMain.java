package mapalone;

import mapalone.model.park;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class MapMain {

    public static void main(String[] args) {
        Map<String,park> map = new HashMap<>();

        try {
            FileReader fr = new FileReader("src\\parks.csv");
            BufferedReader br = new BufferedReader(fr);

                br.readLine();
                String line = "";
                String[] splitLine;

                while ((line = br.readLine()) != null) {
                    splitLine = line.split(",");

                   map.put(splitLine[0],
                            new park(splitLine[1],splitLine[2],splitLine[3],splitLine[4],splitLine[5]));

                }
            }catch(FileNotFoundException e){
                System.out.println("");
            }catch(IOException e){
                System.out.println("");
            }

            System.out.println(map);
        }
    }

