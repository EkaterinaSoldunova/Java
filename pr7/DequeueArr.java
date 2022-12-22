import java.util.Deque;
import java.util.LinkedList;

public class DequeueArr {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 0};
        Deque<Integer> arr1 = new LinkedList<>();
        Deque<Integer> arr2 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            arr1.addLast(a1[i]);
            arr2.addLast(a2[i]);
        }

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if ((arr1.getFirst() > arr2.getFirst() && (arr1.getFirst()!=9 && arr2.getFirst()!=0)) || ((arr1.getFirst() == 0) && (arr2.getFirst() == 9))) {
                arr1.addLast(arr1.getFirst());
                arr1.addLast(arr2.getFirst());
            } else if (arr1.getFirst() < arr2.getFirst() || ((arr1.getFirst() == 9) && (arr2.getFirst() == 0))) {
                arr2.addLast(arr2.getFirst());
                arr2.addLast(arr1.getFirst());
            }
            arr1.pollFirst();
            arr2.pollFirst();

            if (arr1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}
