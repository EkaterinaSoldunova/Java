import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String regex = "(\\w){22}(\\d){5}" ;
        String s1 = "abcdefghijklmnopqrstuv18340";
        String s2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        Pattern p = Pattern. compile (regex);
        Matcher m1 = p.matcher(s1);
        Matcher m2 = p.matcher(s2);
        System.out.println(m1.matches());
        System.out.println(m2.matches());
    }
}
