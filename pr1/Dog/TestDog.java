package Dog;

import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Milo", 2020);
        Dog d2 = new Dog("Finn");
        Dog d3 = new Dog();
        d2.setBirth(2018);
        d3.setName("Ollie");
        System.out.println(d1);
        System.out.println(d2.getName());
        d3.defineAge();
    }
}