import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Task3 extends JFrame {

    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu help = new JMenu("Help");
    JMenuItem file1 = new JMenuItem("Сохранить");
    JMenuItem file2 = new JMenuItem("Выйти");
    JMenuItem edit1 = new JMenuItem("Копировать");
    JMenuItem edit2 = new JMenuItem("Вырезать");
    JMenuItem edit3 = new JMenuItem("Вставить");
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JTextField text = new JTextField(20);
    JPanel[] panel = new JPanel[2];

    public Task3() {
        setSize(300,200);
        setLayout(new GridLayout(2,1));
        setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        file.add(file1);
        file.add(file2);
        edit.add(edit1);
        edit.add(edit2);
        edit.add(edit3);
        for (int i=0; i<panel.length; i++) {
            panel[i] = new JPanel();
            add(panel[i]);
        }
        panel[0].setLayout(new FlowLayout());
        panel[0].add(btn1);
        panel[0].add(btn2);
        panel[1].setLayout(new FlowLayout());
        panel[1].add(text);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Task3();
    }
}