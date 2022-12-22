package Dog;

import java.lang.*;
public class Dog {
    private String name;
    private int birth;
    public Dog(String n, int b){
        name = n;
        birth = b;
    }
    public Dog(String n){
        name = n;
        birth = 2022;
    }
    public Dog(){
        name = "Cooper";
        birth = 2022;
    }
    public void setBirth(int birth) {
        this.birth = birth;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getBirth() {
        return birth;
    }
    public String toString(){
        return name+", year of birth "+birth;
    }
    public void defineAge(){
        System.out.println(name+"'s age is "+(2022-birth)+" years");
    }
}
