package Ball;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("basketball", 4);
        Ball b2 = new Ball("football");
        Ball b3 = new Ball();
        b2.setSize(3);
        b3.setSize(1);
        b3.setType("hockey");
        System.out.println(b1);
        b1.calculateDiameter();
        b2.calculateDiameter();
        b3.calculateDiameter();
    }
}