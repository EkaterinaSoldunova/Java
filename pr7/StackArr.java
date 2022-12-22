import java.util.Stack;

public class StackArr {
    public void pushArrBack (Stack<Integer> arr, int a){
        Stack<Integer> arr2 = new Stack<>();
        while (!arr.isEmpty()) {
            arr2.push(arr.pop());
        }
        arr2.push(a);
        while (!arr2.isEmpty()) {
            arr.push(arr2.pop());
        }
    }
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 0};
        Stack<Integer> arr1 = new Stack<>();
        Stack<Integer> arr2 = new Stack<>();
        StackArr s = new StackArr();
        for (int i = 0; i < 5; i++) {
            s.pushArrBack(arr1, a1[i]);
            s.pushArrBack(arr2, a2[i]);
        }

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if ((arr1.peek() > arr2.peek() && (arr1.peek()!=9 && arr2.peek()!=0)) || ((arr1.peek() == 0) && (arr2.peek() == 9))) {
                s.pushArrBack(arr1, arr1.peek());
                s.pushArrBack(arr1, arr2.peek());
            } else if (arr1.peek() < arr2.peek() || ((arr1.peek() == 9) && (arr2.peek() == 0))) {
                s.pushArrBack(arr2, arr2.peek());
                s.pushArrBack(arr2, arr1.peek());
            }
            arr1.pop();
            arr2.pop();

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
