import java.util.Random;
import java.util.Scanner;

public class RandomTask4 {
    public static void main(String[] args) {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        int n=0;
        while(!check) {
            n = scanner.nextInt();
            if (n>0) check=true;
            else System.out.println("Число <= 0.Повторите ввод.");
        }
        int[] arr = new int[n];
        Random r = new Random();
        int k =0;
        for (int i=0; i<n; i++) {
            arr[i]=r.nextInt(n+1);
            if (arr[i]%2==0) k++;
        }
        System.out.println("Массив:");
        for(int a : arr) {
            System.out.println(a);
        }
        int[] arr2;
        if (k>0){
            arr2 = new int[k];
            k=0;
            for (int i=0; i<n; i++) {
                if (arr[i]%2==0) {
                    arr2[k]=arr[i];
                    k++;
                }
            }
            System.out.println("Массив четных чисел:");
            for(int a : arr2) {
                System.out.println(a);
            }
        }
        else System.out.println("В массиве нет четных чисел");

    }
}
