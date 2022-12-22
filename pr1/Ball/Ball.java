package Ball;
import java.lang.*;
public class Ball {
    private String type;
    private int size;
    public Ball(String t, int s){
        type = t;
        size = s;
    }
    public Ball(String t){
        type = t;
        size = 0;
    }
    public Ball(){
        type = "universal";
        size = 0;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String toString() {
        return "Type: "+type+", size: "+size;
    }
    public void calculateDiameter(){
        System.out.println("Diameter of "+type+" ball with "+size+" size: "+size*5);
    }
}
