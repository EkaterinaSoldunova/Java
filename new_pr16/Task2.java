import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Task2 extends JFrame {

    JMenuBar menuBar = new JMenuBar();
    JMenu color = new JMenu("Цвет");
    JMenu font = new JMenu("Шрифт");
    JMenuItem color1 = new JMenuItem("синий");
    JMenuItem color2 = new JMenuItem("красный");
    JMenuItem color3 = new JMenuItem("чёрный");
    JMenuItem font1 = new JMenuItem("Times New Roman");
    JMenuItem font2 = new JMenuItem("MS Sans Serif");
    JMenuItem font3 = new JMenuItem("Courier New");

    JTextField text = new JTextField(10);
    Font fnt1 = new Font("Times new roman",Font.BOLD,20);
    Font fnt2 = new Font("MS Sans Serif",Font.BOLD,20);
    Font fnt3 = new Font("Courier New",Font.BOLD,20);

    public Task2() {
        super("Menu");
        setSize(300,200);
        setLayout(null);
        text.setBounds(20,50,180,40);
        text.setFont(fnt1);
        setJMenuBar(menuBar);
        menuBar.add(color);
        menuBar.add(font);
        color.add(color1);
        color.add(color2);
        color.add(color3);
        font.add(font1);
        font.add(font2);
        font.add(font3);
        add(text);

        color1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLUE);
            }
        });
        color2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.RED);
            }
        });
        color3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLACK);
            }
        });
        font1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(fnt1);
            }
        });
        font2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(fnt2);
            }
        });
        font3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(fnt3);
            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Task2();
    }
}