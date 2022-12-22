public class Person {
    String name;
    String surname;
    String patronymic;
    public Person(String surname, String name, String patronymic){
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
    }
    public Person(String surname){
        this.surname=surname;
        this.name="";
        this.patronymic="";
    }
    public String getFIO(){
        if (name.equals("") || patronymic.equals("")){
            return surname;
        }
        else return surname+" "+name.charAt(0)+"."+patronymic.charAt(0)+".";
    }
    public static void main(String arg[]){
        Person p1 = new Person("Иванова","Мария","Ивановна");
        Person p2 = new Person("Петрова");
        System.out.println(p1.getFIO());
        System.out.println(p2.getFIO());
    }
}
