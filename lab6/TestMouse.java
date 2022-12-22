import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class TestMouse extends JFrame{
    JLabel northLabel = new JLabel("NORTH", SwingConstants.CENTER);
    JLabel centerLabel = new JLabel("CENTER",SwingConstants.CENTER);
    JLabel eastLabel = new JLabel("EAST",SwingConstants.CENTER);
    JLabel westLabel = new JLabel("WEST",SwingConstants.CENTER);
    JLabel southLabel = new JLabel("SOUTH",SwingConstants.CENTER);
    public TestMouse(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(northLabel, BorderLayout.NORTH);
        add(centerLabel, BorderLayout.CENTER);
        add(eastLabel, BorderLayout.EAST);
        add(westLabel, BorderLayout.WEST);
        add(southLabel, BorderLayout.SOUTH);

        northLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в РТУ МИРЭА");
            }
        });
        centerLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Москву");
            }
        });
        eastLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Дахране");
            }
        });
        westLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Джидда");
            }
        });
        southLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Абха");
            }
        });

        setSize(800,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestMouse();
    }
}
