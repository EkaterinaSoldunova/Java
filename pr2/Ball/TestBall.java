package Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(150, 150);
        Ball b2 = new Ball();
        b2.setXY(100,100);
        System.out.println(b2);
        System.out.println(b1);
        b1.move(10, 20);
        System.out.println(b1);
    }
}
