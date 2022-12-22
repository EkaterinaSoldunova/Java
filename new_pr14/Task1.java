import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String regex = "(\\w)+" ;
        String s = "cat, dog, mouse, rabbit";
        Pattern p = Pattern. compile (regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
