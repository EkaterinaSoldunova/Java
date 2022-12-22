public class Head {
    private int diameter;
    public Head(int d) {
        diameter = d;
    }
    public void setDiameter(int d){
        diameter = d;
    }
    public int getDiameter(){
        return diameter;
    }
    public String toString(){
        return "diameter of head: "+diameter;
    }
}
