//Даны два целых числа A и В (каждое в отдельной строке). Выведите все
//числа от A до B включительно, в порядке возрастания, если A < B, или в порядке
//убывания в противном случае.
public class Task3 {
    public static String rec(int a, int b) {
        if (a > b) {
            return a + " " + rec(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + rec(a + 1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(rec(30, 20));
        System.out.println(rec(10, 20));
    }
}