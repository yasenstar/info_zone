// Handel an event in a Swing program

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swingEventHandling {

    JLabel jlab;

    swingEventHandling() {

        // Create a new JFrame container
        JFrame jfrm = new JFrame("An Event Example");

        // Give the frame an initial size
        jfrm.setSize(600, 400);

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the frame
        jfrm.setVisible(true);

        // Specify FlowLayout for the layout manager
        jfrm.setLayout(new FlowLayout());

        // Make two buttons
        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");

        // Add the buttons to the content pane
        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);

        // Add action listener for Alpha
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Alpha was pressed");
            }
        });

        // Add action listener for Beta
        jbtnBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Beta was pressed");
            }
        });

        // Create a text-based label
        jlab = new JLabel("Press a button.");

        // Add the label to the content pane
        jfrm.add(jlab);

    }
    public static void main(String args[]) {
        // Create the frame on the event handling thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new swingEventHandling();
            }
        });
    }
}
