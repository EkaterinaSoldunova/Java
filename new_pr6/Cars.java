public class Cars implements Nameable{
    private String name;
    public Cars(){}
    public Cars(String name){
        this.name=name;
    }
    @Override
    public String getName(){
        return "Car: "+name;
    }
}
