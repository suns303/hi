package oop;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ClassMemberExampleTest {
    public static void  main(String[]args){
        classMemberExample cme = new classMemberExample();
        int b = classMemberExample.getStaticTest();
        int a = classMemberExample.CLASS_MEMBER;
        System.out.println(a);
        int r = (int)(Math.random()*6+1);
        System.out.println(r);
    }
}
