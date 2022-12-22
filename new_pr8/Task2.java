//Дано натуральное число n. Выведите все числа от 1 до n.
public class Task2 {
    public static String rec(int n) {
        if (n == 1) {
            return "1";
        }
        return rec(n - 1) + " " + n;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(rec(n));
    }
}
