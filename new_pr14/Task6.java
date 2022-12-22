import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String regex1 = "([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})" ;
        String s = "user@example.com, myhost@@@com.ru, @my.ru, Julia String";
        Pattern p1 = Pattern. compile (regex1);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
