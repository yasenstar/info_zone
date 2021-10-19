// A sample Swing application

import javax.swing.*;

class SwingDemo {

    SwingDemo() {

        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Give the frame an initial size.
        jfrm.setSize(500, 350);

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label.
        JLabel jlab = new JLabel(" Swing means powerful GUIs.");

        // Add the label to the content pane.
        jfrm.add(jlab);

/*         // Create a button.
        JButton jbtn = new JButton("OK");

        // Add the button to the content pane
        jfrm.add(jbtn); */

        // Display the Frame.
        jfrm.setVisible(true);
    }
}

public class swingDesktopSample {
    
    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
