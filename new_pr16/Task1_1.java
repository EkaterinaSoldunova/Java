import java.awt.event.*;
import javax.swing.*;

class Task1_1 extends JFrame {
    int a = 10, b;
    int k = 0;
    JButton button = new JButton("Проверка");
    JLabel label = new JLabel("Введите число: ");
    JTextField text = new JTextField(5);
    public Task1_1() {
        setSize(300,130);
        setLayout(null);
        label.setBounds(10,10,100,20);
        text.setBounds(130,10,100,20);
        button.setBounds(10,40,100,30);
        add(label);
        add(text);
        add(button);

        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                k++;
                if (k<=3) {
                    b = Integer.valueOf(text.getText());
                    if (b == a) {
                        JOptionPane.showMessageDialog(null, "Вы угадали число.");
                        k = 0;
                    }
                    else if (b < a)
                        JOptionPane.showMessageDialog(null, "Ошибка. Задуманне число больше.");
                    else JOptionPane.showMessageDialog(null, "Ошибка. Задуманне число меньше.");
                }
                if (k == 3 && b != a)  {
                    JOptionPane.showMessageDialog(null, "Вы не угадали число. Попытки закончились.");
                    k =0;
                }
            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[]args) {
        new Task1_1();
    }
}