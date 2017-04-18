package school;

import school.model.NameId;
import school.model.School;
import school.service.SchoolService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolMain {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src\\schools.csv");
        BufferedReader br = new BufferedReader(fr);

        List<School> schoolList = new ArrayList<>();
        br.readLine(); // 첫줄 없애는것
        String line = "";
        String[] splitLine;


        while((line = br.readLine())!=null ){
            splitLine=line.split(",");

            schoolList.add(new School(splitLine[0],splitLine[1],splitLine[2],splitLine[3],splitLine[4]));
        }

        SchoolService service = new SchoolService();
        List<School> resetId = service.schoolNameReset(schoolList);

        SchoolService service1 = new SchoolService();
        List<NameId> result = service1.nameIdReset(schoolList);

        System.out.printf("%s\n",result);

    }
}
