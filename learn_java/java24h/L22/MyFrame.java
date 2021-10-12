import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class MyFrame extends JFrame implements TableModelListener {
    
    private MyTableModel myTableModel;
    private JTable myTable;

    MyFrame (String winTable) {
        super(winTable);

        myTableModel = new MyTableModel();
        myTable = new JTable(myTableModel);

        // Add the JTable to frame and enable scrolling
        add(new JScrollPane(myTable));

        // Register an event listener
        myTableModel.addTableModelListener(this);
    }

    public void tableChangd(TableModelEvent e) {
        // Code to porcess data changes goes here
    }

    public static void main(String args[]) {
        MyFrame myFrame = new MyFrame("My Test Window");

        myFrame.pack();

        myFrame.setVisible(true);
    }

    class MyTableModel extends AbstractTableModel {
        // The data for JTable should be here
    }
}
