public class Planets implements Nameable{
    private String name;
    public Planets(){}
    public Planets(String name){
        this.name=name;
    }
    @Override
    public String getName(){
        return "Planet: "+name;
    }
}
