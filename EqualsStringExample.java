import java.lang.*;
import java.lang.String;

/**
 * Created by USER on 12.02.2017.
 */
public class EqualsStringExample {
    public static void main(String[] args) {
        String string= new String("КонституциЯ Беларуси");
        String string1= new String("Конституция Беларуси");
        System.out.println(string1.equals(string));
        System.out.println(string1.equalsIgnoreCase(string));
        System.out.println(string1.regionMatches(5,string,4,4));
        System.out.println(string.regionMatches(true,4,string1,5,4));
        System.out.println( string1.compareTo(string));
        System.out.println(string.compareToIgnoreCase(string1));
        System.out.println(string.startsWith("Конституци"));
        System.out.println(string.endsWith("уси"));
        String s1= "2 Конституция Беларуси Конституция Беларуси";
        System.out.println(s1.indexOf("Б"));
        System.out.println(s1.lastIndexOf("Б"));
        System.out.println(s1.indexOf("Беларуси"));
        System.out.println(s1.lastIndexOf("Беларуси"));
        System.out.println(s1.indexOf("2"));
        String s3= s1.substring(35);
        System.out.println(s3);
        String s4= s1.substring(12,35);
        System.out.println(s4);
        String s5=s3+s4;
        System.out.println(s5);
    }
}
