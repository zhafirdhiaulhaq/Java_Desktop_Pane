package view;

//import controller.controlTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class internalTable extends JInternalFrame {

    public JTable table;
    public JButton btn;
//    private controlTable ct;
    private Object teams[][] = {{"Raja Nanda", "087789474646"},
        {"Maulidya Ardini", "089674622789"}, 
        {"Randy Fahreza", "089654545558"}};
    String[] jj = {"Nama", "No.Telepon"};

    public internalTable() {
        super("internal Table",true,true,true,true);
        Container c = getContentPane();
        
        c.setLayout(new FlowLayout());
        table = new JTable(teams,jj);
        c.add(new JScrollPane(table),table);
        
//        ct = new controlTable(this);
//        btn = new JButton("REMOVE");
//        btn.addActionListener(ct);
//        c.add(btn);
        
        setSize(600, 300);
        show();
    }
}
