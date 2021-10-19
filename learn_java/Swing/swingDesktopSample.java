// A sample Swing application

import javax.swing.*;

class SwingDemo {

    SwingDemo() {

        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");
        // JFrame jfrm =new JFrame();

        // Give the frame an initial size.
        // void setSize(int width, int height)
        jfrm.setSize(500, 350);

        // Terminate the program when the user closes the application
        // void setDefaultCloseOperation(int what)
        // "what" can be EXIT_ON_CLOSE, DISPOSE_ON_CLOSE, HIDE_ON_CLOSE, DO_NOTHING_ON_CLOSE
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label.
        JLabel jlab = new JLabel(" Swing means powerful GUIs.");

        // Add the label to the content pane.
        // other actions like add() are remove(), setLayout()
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
        // two methods by SwingUtilities are invokeLater() and invokeAndWait()
        // static void invokeLater(Runnable obj)
        // statis void invokeAndWait(Runnable obj) throws InterruptedException, InvocationTargetException
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
