public class Task1 {
    public void method(String str){
        System.out.println("Последний символ строки: "+str.charAt(str.length()-1));
        System.out.println("Строка заканчивается на !!!? "+str.endsWith("!!!"));
        System.out.println("Строка начинается на I like? "+str.startsWith("I like"));
        System.out.println("Строка содержит Java? "+str.contains("Java"));
        System.out.println("Позиция подстроки Java: "+str.indexOf("Java"));
        System.out.println("Замена символов а на о: "+str.replace('a','o'));
        System.out.println("Верхний регистр: "+str.toUpperCase());
        System.out.println("Нижний регистр: "+str.toLowerCase());
        System.out.println("Вырезать строку Java: "+str.substring(7,11));
    }
    public static void main(String arg[]){
        Task1 t = new Task1();
        t.method("I like Java!!!");
    }
}
