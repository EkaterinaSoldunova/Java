public class PrimeNum {
    public static String recursion(int n, int i) {
        if (n < 2) {
            return "NO";
        }
        else if (n == 2) {
            return "YES";
        }
        else if (n % i == 0) {
            return "NO";
        }
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return "YES";
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(19, 2));
    }
}
