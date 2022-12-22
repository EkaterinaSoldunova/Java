import java.awt.*;

public class Circle extends Shape{
    Circle(int x, int y, Color color){
        this.x=x;
        this.y=y;
        this.color=color;
    }
    @Override
    public void draw(Graphics2D gr2d) {
        gr2d.setColor(color);
        int r = (int)(Math.random()*100);
        gr2d.fillOval(x,y,r,r);
    }
}
