public class Task1 {
    public static void exceptionDemo1() {
        System.out.println(2 / 0);
    }

    public static void exceptionDemo2() {
        System.out.println(2.0/0.0);
    }

    public static void exceptionDemo3() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        //exceptionDemo1();
        // вывод: java.lang.ArithmeticException: / by zero at

        //exceptionDemo2();
        // вывод: Infinity

        exceptionDemo3();
        // catch перехватывает ошибку ArithmeticException и выводит сообщение
    }
}