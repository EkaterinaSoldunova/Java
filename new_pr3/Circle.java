import java.util.Random;

public class Circle {
    Point center;
    Random rand = new Random();
    int radius= rand.nextInt(100);

    Circle(int x, int y){
        center =new Point(x, y);
    }
    public String toString(){
        return "окружность с центром в точке "+center+" и радиусом = "+radius;
    }
}
