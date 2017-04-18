package players;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerMain {
    public static void main(String[]args) throws Exception{

//        //1. data loading from csv
//        FileReader  fr = new FileReader("src\\Salaries.csv");
//        BufferedReader br = new BufferedReader(fr);
//
        BufferedReader br = new BufferedReader(
                new FileReader("src\\Salaries.csv"));
        br.readLine();
        String line = "";
        List<Player> players = new ArrayList<>();
        while ((line = br. readLine())  != null){
            String[] splitted = line.split(",");
            players.add(new Player(splitted[1],
                    splitted[0],splitted[2],
                    splitted[3],Integer.parseInt(splitted[4])));
        }
        System.out.println(players.size());

        //2. 현재 데이터를 분석해서 결론을 도출
        //2-1

        PlayerService service = new PlayerService();
        Player player = service.getHighestSalaryPlayer(players);

        System.out.printf("%s의 연봉은 %d불 입니다.", player.getPlayerId(),player.getSalary());


    }

}
