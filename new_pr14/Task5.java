import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String regex1 = "(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[9]|[2-9]\\d)\\d{2})" ;
        String s = "28/02/2000, 30/04/2003, 21/02/2003, 30-04-2003, 1/1/1899";
        Pattern p1 = Pattern. compile (regex1);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
