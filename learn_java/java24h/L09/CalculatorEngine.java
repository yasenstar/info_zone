import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class CalculatorEngine implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, "Something happened...", "Just a Test", JOptionPane.PLAIN_MESSAGE);
    }
}
