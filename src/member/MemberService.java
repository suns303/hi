package member;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberService {

    public double calcAverScore(List<Member> memberList){
        int sum =0;
        int count = 0;
        for(Member e : memberList){
            sum += e.getAge();
            count++;
        }
        double average = (double) sum /count;
        return average;
    }


    public double averagename(List<Member> memberList){
        int charCount = 0;
        int wordCount = 0;
        double nameaverage = 0;
        for(Member e : memberList){
            charCount += e.getName().length();
            wordCount++;
        }
        nameaverage = charCount /(double)wordCount;
        return nameaverage;
    }
    public int kimreserch(List<Member> memberList,String checkfirstname){
        int count = 0;

        for(Member e: memberList){
            if (e.getName().substring(0,1).equals(checkfirstname))
                count++;
        }

                return count;
    }
}