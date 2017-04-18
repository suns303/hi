package salarys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class salaryexe {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("scr\\salary.csv");
        BufferedReader br = new BufferedReader((fr));

        List<Salary> list = new ArrayList();
        String line = "";
        int zerocheck = 0;
        br.readLine();
        String[] splitLine;

        while ((line = br.readLine()) != null) {

            if (zerocheck == 0)
                zerocheck = 1;
            else {
                splitLine = line.split(",");

                Salary t1 = new Salary(splitLine[0], splitLine[1], splitLine[2], splitLine[3], splitLine[4]);
                list.add(t1);
            }
            SalraryMain service = new SalraryMain();

            SalraryMain service2 = new SalraryMain();



        }
    }
}
