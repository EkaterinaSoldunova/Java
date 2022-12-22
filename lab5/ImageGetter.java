import javax.swing.*;
import java.awt.*;
public class ImageGetter extends JFrame{
    public ImageGetter() {
        setSize(300, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon("src/icon.jpg");
        getContentPane().add(new JLabel(icon));
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ImageGetter();
    }
}
