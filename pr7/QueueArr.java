import java.util.LinkedList;
import java.util.Queue;

public class QueueArr {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 0};
        Queue<Integer> arr1 = new LinkedList<>();
        Queue<Integer> arr2 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            arr1.offer(a1[i]);
            arr2.offer(a2[i]);
        }

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if ((arr1.peek() > arr2.peek() && (arr1.peek()!=9 && arr2.peek()!=0)) || ((arr1.peek() == 0) && (arr2.peek() == 9))) {
                arr1.offer(arr1.peek());
                arr1.offer(arr2.peek());
            } else if (arr1.peek() < arr2.peek() || ((arr1.peek() == 9) && (arr2.peek() == 0))) {
                arr2.offer(arr2.peek());
                arr2.offer(arr1.peek());
            }
            arr1.remove();
            arr2.remove();

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
