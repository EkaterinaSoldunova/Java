import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String regex1 = "((\\d+\\.\\d+)|(\\d+))(\\s)(USD|EU|RUB)" ;
        String s = "Яблоко 12.12 RUB, банан 2 USD, киви 3.14 EU, малина 1 ERR";
        Pattern p1 = Pattern. compile (regex1);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
