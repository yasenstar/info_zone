import javax.swing.*;
// learn java swing methods at https://javatpoint.com/java-swing

public class HelloJava_Frame_new {
    public static void main(String[] args) {
        //System.out.println("Hello, Java. (Yasen, 2020-11-15)");
        // instead of using println, we use below JFrame, with "import javax.swing.*"

        JFrame frame = new JFrame( "Hello, Java!" );

        // add one label
/*         JLabel label = new JLabel("Hello, World!\n This is the wonderful world!", JLabel.LEFT);
        label.setBounds(50,40,100,30);
        frame.add(label); */

        frame.add( new HelloComponent());

/*         JButton button = new JButton("Continue?");
        button.setBounds(200,100,95,30);

        frame.add(button); */
        // need to learn the syntax of "button" ;-)

        frame.setSize( 500, 500 );
        frame.setVisible( true );
    }
}

/*
Be aware that when you click on the window's close box, the window goes away, but your programming is still running.
We will fix this shutdown behavior in later version of the example.
*/