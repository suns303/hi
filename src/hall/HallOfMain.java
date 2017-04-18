package hall;

import hall.model.HallofFame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class HallOfMain {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("src\\HallOfFame.csv"));

        List<HallofFame> fames = new ArrayList<>();

        String line = "";
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] splitted = line.split(",");
            HallofFame fame = new HallofFame();

            fame.setPlayerID(splitted[0]);
            fame.setBallots(splitted[3].equals("") ? 0 : Integer.parseInt(splitted[3]));
            fame.setNeeded(splitted[4].equals("") ? 0 : Integer.parseInt(splitted[4]));
            fame.setVotes(splitted[5].equals("") ? 0 : Integer.parseInt(splitted[5]));
            fames.add(fame);

//            if (splitted[3].equals("")) {
//                fame.setBallots(0);
//            } else {
//                fame.setBallots(Integer.parseInt(splitted[3]));
//            }
//
//            if (splitted[4].equals("")) {
//                fame.setNeeded(0);
//            } else {
//                fame.setNeeded(Integer.parseInt(splitted[4]));
//            }
//            if (splitted[5].equals("")) {
//                fame.setVotes(0);
//            } else {
//                fame.setVotes(Integer.parseInt(splitted[5]));
//            }
//            fames.add(fame);


        }


        //2. mapping
        // HallOffame --> playerAverage


            List<PlayerAverage> newList = new ArrayList<>();
            for (HallofFame e : fames) {
                PlayerAverage p = new PlayerAverage();
                p = new PlayerAverage();
                p.setPlayerId(e.getPlayerID());
                p.setAverage(
                        (e.getBallots() + e.getNeeded() + e.getVotes()) / 3);
                newList.add(p);

            }
            System.out.println(newList.size());
            System.out.println(newList.get(1999));
            System.out.println(newList.get(2000));
        }
    }