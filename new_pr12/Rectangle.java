import java.awt.*;
import java.awt.geom.GeneralPath;

public class Rectangle extends Shape{
    Rectangle(int x, int y, Color color){
        this.x=x;
        this.y=y;
        this.color=color;
    }
    @Override
    public void draw(Graphics2D gr2d) {
        gr2d.setColor(color);
        gr2d.fillRect(x,y,(int)(Math.random()*300),(int)(Math.random()*300));
    }
}
