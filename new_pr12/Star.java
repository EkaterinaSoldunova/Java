import java.awt.*;
import java.awt.geom.GeneralPath;

public class Star extends Shape{
    Star(int x, int y, Color color){
        this.x=x;
        this.y=y;
        this.color=color;
    }
    @Override
    public void draw(Graphics2D gr2d) {
        int xPoints[] = {18, 30, 0, 36, 6};
        int yPoints[] = {0, 36, 12, 12, 36};

        GeneralPath star = new GeneralPath();

        star.moveTo(xPoints[0] + x, yPoints[0] + y);
        for (int i = 1; i < xPoints.length; i++) {
            star.lineTo(xPoints[i] + x, yPoints[i] + y);
        }
        star.closePath();

        gr2d.setColor(color);
        gr2d.fill(star);
    }
}
