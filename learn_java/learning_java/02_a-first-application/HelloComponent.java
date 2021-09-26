import javax.swing.*;
import java.awt.*;

class HelloComponent extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Hello Java World!\n @xiaoqi.com", 225, 196);
    }
}
