import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class ShowPicture1 {
    public static void main(String args[]) {
        new MyFrame();
    }
}

class MyFrame extends JFrame {

    MyFrame() {
        ImageIcon icon = new ImageIcon("volvo.png");
        JLabel label = new JLabel(icon);

        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
}