import java.io.IOException;
import java.lang.*;
import java.lang.String;

/**
 * Created by USER on 11.02.2017.
 */
public class StringExample {
    public static void main(String[] args) throws IOException {


    String s="ABCDETH";
    int n = "ABC".length();
//        System.out.println(n);
//        String f = new BufferedReader(new InputStreamReader(System.in)).readLine();
//        System.out.println("вы написали " + f.length() + " символов " );
        People.hello();
       String i = String.valueOf(123);
        System.out.println(i+1);
        People people= new People();
        System.out.println(people.toString());
        System.out.println(s.charAt(5));
        char[] c=new char[10] ;
        s.getChars(1,3,c,0);
        for(int k=0; k<c.length; k++){
            System.out.println(c[k]);
        }

        System.out.println("/////////////////////////////////////////");

      String z="Hello";
        int k = z.length();
        System.out.println("длина строки: " + k + " символов");


        String b="как ";
        String m=" дела";
        System.out.println(b.concat(m));


      String j = new String("  Hello");
        System.out.println(j.trim());

     String u= new String("aoaoaoao") ;
     String ul= new String("JKLMNOP") ;

        String u1=u.replaceAll("o","!");
        System.out.println(u1);
        System.out.println(u);
        System.out.println(ul);

        String t= new String("Как дела?");
        System.out.println(t.toLowerCase());

        String string= new String("БУДЬ здоров");
        System.out.println(string.toUpperCase());

        String string1= new String("How are you?");
        System.out.println(string1.replaceAll("o","a"));
        System.out.println(string1.replaceFirst("o","a"));
        String u2=string1.replaceAll("a","o");
        System.out.println(u2);
        String u3=string1.replaceFirst("o","a");
        System.out.println(u3);
    }
}