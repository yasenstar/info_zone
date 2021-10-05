import javax.swing.JFrame;
import javax.swing.JButton;

public class HelloWorld extends JFrame {
    public static void main(String args[]) {
        JFrame myFrame = new JFrame();
        JButton myButton = new JButton("Click Me");

        myFrame.add(myButton);
        myFrame.setSize(600,400);
        myFrame.setTitle("HelloWorld");
        myFrame.setVisible(true);
    }
}