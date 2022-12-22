public class TestProcessStrings {
    public static void main(String[] args) {
        String str="Green";
        ProcessStrings t = new ProcessStrings();
        System.out.println("Строка: "+str);
        System.out.println("Количество символов в строке: "+t.sizeOfLine(str));
        System.out.println("Строка из нечетных позиций исходной: "+t.oddSymbol(str));
        System.out.println("Инвертированная строка: "+t.invertLine(str));
    }
}
