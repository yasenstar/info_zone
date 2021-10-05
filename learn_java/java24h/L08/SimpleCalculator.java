import java.awt.*;
import javax.swing.*;

public class SimpleCalculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");

        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(15);
        JButton go = new JButton("Add");

        // FlowLayout is default for JPanel
        JPanel panel = new JPanel(new FlowLayout());
        // add buttons to the panel
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(result);
        panel.add(go);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}