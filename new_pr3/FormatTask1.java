import java.util.Formatter;
import java.util.Scanner;

public class FormatTask1 {
    //Класс-конвертер валют
    public double rub_usd(double rub) {
        return rub*0.0163;
    }
    public double usd_rub(double usd) {
        return usd*61.5018;
    }
    public double eur_usd(double eur) {
        return eur*0.9827;
    }
    public double usd_eur(double usd) {
        return usd*1.0176;
    }
    public double rub_eur(double rub) {
        return rub*0.0165;
    }
    public double eur_rub(double eur) {
        return eur*60.4371;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Из какой валюты перевести?");
        String in = sc.next();
        System.out.println("В какую валюту перевести?");
        String out = sc.next();
        System.out.println("Какие денежные средства?");
        String money = sc.next();
        double ans = 0.0;
        FormatTask1 f = new FormatTask1();
        if (in.equals("rub")) {
            if (out.equals("usd")) {
                ans = f.rub_usd(Double.parseDouble(money));
            }
            else if (out.equals("eur")) {
                ans = f.rub_eur(Double.parseDouble(money));
            }
        }
        else if (in.equals("usd")) {
            if (out.equals("rub")) {
                ans = f.usd_rub(Double.parseDouble(money));
            }
            else if (out.equals("eur")) {
                ans = f.usd_eur(Double.parseDouble(money));
            }
        }
        else if (in.equals("eur")) {
            if (out.equals("usd")) {
                ans = f.eur_usd(Double.parseDouble(money));
            }
            else if (out.equals("rub")) {
                ans = f.eur_rub(Double.parseDouble(money));
            }
        }
        Formatter fmt = new Formatter();
        fmt.format("%s %s = %f %s",money,in, ans, out);
        System.out.println(fmt);
    }
}

