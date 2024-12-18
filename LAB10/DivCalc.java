import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivCalc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel labelNum1 = new JLabel("Enter Num1: ");
        JTextField textNum1 = new JTextField();
        JLabel labelNum2 = new JLabel("Enter Num2: ");
        JTextField textNum2 = new JTextField();

        JButton buttonDivide = new JButton("Divide");

        buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textNum1.getText());
                    int num2 = Integer.parseInt(textNum2.getText());

                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }

                    int result = num1 / num2;
                    JOptionPane.showMessageDialog(frame, "Result: " + result + "\nName: Daivya Priyankkumar Shah\nUSN: 1BM23CS084", "Division Result", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Math Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(labelNum1);
        panel.add(textNum1);
        panel.add(labelNum2);
        panel.add(textNum2);
        panel.add(buttonDivide);

        frame.add(panel);
        frame.setVisible(true);
    }
}
