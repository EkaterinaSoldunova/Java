import java.util.Arrays;
import java.util.Random;

public class RandomTask3 {
    public String check(int[] arr){
        for (int i=1; i<arr.length; i++) {
            if (arr[i]<arr[i-1]) return "Массив не является строго возрастающей последовательностью";
        }
        return "Массив является строго возрастающей последовательностью";
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random r = new Random();
        for (int i=0; i<4; i++) {
            arr[i]=r.nextInt(90)+10;
        }
        System.out.println("Array:");
        String arrayToString = Arrays.toString(arr);
        System.out.println(arrayToString);
        RandomTask3 t = new RandomTask3();
        System.out.println(t.check(arr));
    }
}
