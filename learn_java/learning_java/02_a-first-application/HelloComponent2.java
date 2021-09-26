import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class HelloComponent2 extends JComponent implements MouseMotionListener {
    String theMessage;
    int messageX = 125, messageY = 95; // Coordinates of the message

    public HelloComponent2(String message) {
        theMessage = message;
        addMouseMotionListener(this);
    }

    public void paintComponent( Graphics g) {
        g.drawString( theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        // Save the mouse coordinate and paint the message
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {}
}
