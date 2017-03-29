import java.lang.*;
import java.lang.String;

/**
 * Created by USER on 17.02.2017.
 */
public class SubstringExample {
    public static void main(String[] args) {
        String s1 = "12zzz345qwe678qwe90qwe";
        String s2 = "qwe";
        String s3 = "zzzz";
        System.out.println(s1.indexOf(s3));
        System.out.println(s1.indexOf(s2));
        StringBuffer s = new StringBuffer(s1);
        System.out.println(s.toString());
        System.out.println(s.delete(2,5));
        System.out.println(s.append("0"));
        System.out.println(s.insert(5,s3));
        System.out.println(s.deleteCharAt(7));
        int index = 5;
        char ch = 'X';
        s.setCharAt(index, ch);
        System.out.println(s);
        int p = -1;
        while((p=s1.toString().indexOf(s2))>=0) {
            s.delete(p,p+s2.length());
        }
        s1=s.toString();
        System.out.println(s1);


    }
}
