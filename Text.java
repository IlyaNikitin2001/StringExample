import java.lang.*;

/**
 * Created by USER on 15.02.2017.
 */
public class Text {
    public static void main(String[] args) {


        StringBuffer s = new StringBuffer("Алгоритмы+Данные=Программы");
        System.out.println(s);
        s.delete(10,16);
        s.delete(11,20);
        s.replace(10,12,"-");
        s.replace(9,10,"=");
       s.insert(10,"Программы");
        s.insert(20,"Данные");
        System.out.println(s);
        String string = new String("Алгоритмы+Данные=Программы");
        int p1 = string.indexOf('+');
        System.out.println(p1);
        int p2 = string.indexOf('=');
        String algoritm = string.substring(0,p1);
        System.out.println(algoritm);
        String dannie = string.substring(p1+1,p2);
        System.out.println(dannie);
       String program = string.substring(p2+1,26);
        System.out.println(program);
       java.lang.String s1 = algoritm+ " = " + program+ " - " +dannie ;
        System.out.println(s1);

    }
}
