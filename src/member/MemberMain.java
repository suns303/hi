package member;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberMain {
    public static void main(String[]args){

//        Member member = new Member();
        Member member1 = new Member("황순성",27,"010-5052-9103","suns303@naver.com");
        Member member2 = new Member("허민",30,"010-5052-9104","suns304@naver.com");
        Member member3 = new Member("진하영",24,"010-5052-9105","suns305@naver.com");
        Member member4 = new Member("이기봉",26,"010-5052-9106","suns306@naver.com");
        Member member5 = new Member("임진성",20,"010-5052-9103","suns303@naver.com");
        Member member6 = new Member("김태준",27,"010-5052-9113","suns313@naver.com");
        Member member7 = new Member("이진성",26,"010-5052-9102","suns323@naver.com");
        Member member8 = new Member("류관이",25,"010-5052-9100","suns333@naver.com");
        Member member9 = new Member("이기원",25,"010-5052-9107","suns343@naver.com");
        Member member10 = new Member("류승아",25,"010-5052-9108","suns353@naver.com");
        Member member11 = new Member("김세원",27,"010-5052-9109","suns363@naver.com");

        List<Member> list = Arrays.asList(member1,member2,member3,member4,member5,member6,member7,member7,
        member8,member9,member10,member11);

        MemberService service = new MemberService();
        double average = service.calcAverScore(list);

        MemberService service1 = new MemberService();
        double nameaverage = service1.averagename(list);

        System.out.println("성을 입력하시오");
        Scanner in = new Scanner(System.in);
        String firstname = in.next();
        int countfirst = service.kimreserch(list, firstname);


        System.out.println(average);
        System.out.println(nameaverage);
        System.out.println(countfirst);
    }
    }
