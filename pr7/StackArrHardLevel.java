import java.util.Scanner;
import java.util.Stack;

public class StackArrHardLevel {
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
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> arr1 = new Stack<>();
        Stack<Integer> arr2 = new Stack<>();
        StackArr s = new StackArr();

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 5; i++) {
            System.out.println("Откройте по одной новой карте:");
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            s.pushArrBack(arr1, n1);
            s.pushArrBack(arr2, n2);
            if ((n1 > n2 && (n1!=9 && n2!=0)) || ((n1 == 0) && (n2 == 9))) {
                System.out.println("Игрок №1 забирает обе карты");
            } else if (n1 < n2 || ((n1 == 9) && (n2 == 0))) {
                System.out.println("Игрок №2 забирает обе карты");
            }
        }

        for (int i = 0; i < 106; i++) {
            count++;
            if (i>=5) {
                System.out.println("Карты:"+arr1.peek()+", "+arr2.peek());
            }
            if ((arr1.peek() > arr2.peek() && (arr1.peek()!=9 && arr2.peek()!=0)) || ((arr1.peek() == 0) && (arr2.peek() == 9))) {
                s.pushArrBack(arr1, arr1.peek());
                s.pushArrBack(arr1, arr2.peek());
                if (i>=5) {
                    System.out.println("Игрок №1 забирает обе карты");
                }
            } else if (arr1.peek() < arr2.peek() || ((arr1.peek() == 9) && (arr2.peek() == 0))) {
                s.pushArrBack(arr2, arr2.peek());
                s.pushArrBack(arr2, arr1.peek());
                if (i>=5) {
                    System.out.println("Игрок №2 забирает обе карты");
                }
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
