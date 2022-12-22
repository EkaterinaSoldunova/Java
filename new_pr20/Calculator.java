public class Calculator {

    public static <T> String res(T a) {
        int num1i; double num1d; long num1l; float num1f;
        if (a instanceof Integer) {
            num1i = ((Integer) a).intValue();
            return "int";
        }
        if (a instanceof Double) {
            num1d = ((Double) a).doubleValue();
            return "double";
        }
        if (a instanceof Float) {
            num1f = ((Float) a).floatValue();
            return "float";
        }
        return "";
    }
    public static <T,V> void sum(T a, V b) {
        String s1, s2;
        s1 = res(a);
        s2 = res(b);
        if (s1.equals("int")) {
            if (s2.equals("int")) System.out.println(((Integer) a).intValue() + ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Integer) a).intValue() + ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Integer) a).intValue() + ((Float) b).floatValue());
        }
        else if (s1.equals("double")) {
            if (s2.equals("int")) System.out.println(((Double) a).doubleValue() + ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Double) a).doubleValue() + ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Double) a).doubleValue() + ((Float) b).floatValue());
        }
        else if (s1.equals("float")) {
            if (s2.equals("int")) System.out.println(((Float) a).floatValue() + ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Float) a).floatValue() + ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Float) a).floatValue() + ((Float) b).floatValue());
        }
        else System.out.println("Ошибка");
    }

    public static <T,V> void multiply(T a, V b) {
        String s1, s2;
        s1 = res(a);
        s2 = res(b);
        if (s1.equals("int")) {
            if (s2.equals("int")) System.out.println(((Integer) a).intValue() * ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Integer) a).intValue() * ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Integer) a).intValue() * ((Float) b).floatValue());
        }
        else if (s1.equals("double")) {
            if (s2.equals("int")) System.out.println(((Double) a).doubleValue() * ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Double) a).doubleValue() * ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Double) a).doubleValue() * ((Float) b).floatValue());
        }
        else if (s1.equals("float")) {
            if (s2.equals("int")) System.out.println(((Float) a).floatValue() * ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Float) a).floatValue() * ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Float) a).floatValue() * ((Float) b).floatValue());
        }
        else System.out.println("Ошибка");
    }

    public static <T,V> void divide(T a, V b) {
        String s1, s2;
        s1 = res(a);
        s2 = res(b);
        if (s1.equals("int")) {
            if (s2.equals("int")) System.out.println(((Integer) a).intValue() / ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Integer) a).intValue() / ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Integer) a).intValue() / ((Float) b).floatValue());
        }
        else if (s1.equals("double")) {
            if (s2.equals("int")) System.out.println(((Double) a).doubleValue() / ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Double) a).doubleValue() / ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Double) a).doubleValue() / ((Float) b).floatValue());
        }
        else if (s1.equals("float")) {
            if (s2.equals("int")) System.out.println(((Float) a).floatValue() / ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Float) a).floatValue() / ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Float) a).floatValue() / ((Float) b).floatValue());
        }
        else System.out.println("Ошибка");
    }

    public static <T,V> void subtraction(T a, V b) {
        String s1, s2;
        s1 = res(a);
        s2 = res(b);
        if (s1.equals("int")) {
            if (s2.equals("int")) System.out.println(((Integer) a).intValue() - ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Integer) a).intValue() - ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Integer) a).intValue() - ((Float) b).floatValue());
        }
        else if (s1.equals("double")) {
            if (s2.equals("int")) System.out.println(((Double) a).doubleValue() - ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Double) a).doubleValue() - ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Double) a).doubleValue() - ((Float) b).floatValue());
        }
        else if (s1.equals("float")) {
            if (s2.equals("int")) System.out.println(((Float) a).floatValue() - ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Float) a).floatValue() - ((Double) b).doubleValue());
            else if (s2.equals("float")) System.out.println(((Float) a).floatValue() - ((Float) b).floatValue());
        }
        else System.out.println("Ошибка");
    }

    public static void main(String[] args) {
        int a = 10;
        double b = 10.5;
        float c = 20.5f;
        System.out.println("Сумма: ");
        sum(a,b);
        sum(a,c);
        sum(b,c);
        System.out.println();

        System.out.println("Произведение: ");
        multiply(a,b);
        multiply(a,c);
        multiply(b,c);
        System.out.println();

        System.out.println("Деление: ");
        divide(a,b);
        divide(a,c);
        divide(b,c);
        System.out.println();

        System.out.println("Разность: ");
        subtraction(a,b);
        subtraction(a,c);
        subtraction(b,c);
        System.out.println();
    }
}
