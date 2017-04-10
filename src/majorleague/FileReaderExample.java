package majorleague;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class FileReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src\\parks.csv");
        BufferedReader br = new BufferedReader(fr);


        List<park> list = new ArrayList();
        String line ="";
        String[] splitLine;
        int zerocheck =0;

        while(( line = br.readLine()) != null){

            if(zerocheck ==0)
                zerocheck =1;
            else {
                splitLine=line.split(",");

                park t1 = new park(splitLine[0],splitLine[1],splitLine[2],splitLine[3],splitLine[4],splitLine[5]);
                list.add(t1);
            }
        }
        majorservice service = new majorservice();
        int usCount = service.sumOfNotUS(list);

        majorservice service1 = new majorservice();
        int aliasCount = service1.sumOfAlias(list);
        majorservice service2 = new majorservice();
        double avarResult = service2.avarOfNamechar(list);
        System.out.printf("국가가 US가 아닌 볼 파크 %d\n",usCount);
        System.out.printf("별명이 있는 볼 파크 수 %d\n",aliasCount);
        System.out.printf("볼파크 이름의 글자 평균 %f\n",avarResult);
    }

}












