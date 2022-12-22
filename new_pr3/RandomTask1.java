import java.util.Arrays;
import java.util.Random;

public class RandomTask1 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i=0; i<5; i++) {
            arr[i]=Math.random();
        }
        Random r = new Random();
        for (int i=5; i<10; i++) {
            arr[i]=r.nextDouble();
        }
        System.out.println("Array:");
        for (Double a : arr) {
            System.out.println(a);
        }
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        for (Double a : arr) {
            System.out.println(a);
        }
    }
}