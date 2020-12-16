package view;

import controller.controlBox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.*;

public class internalBox extends JInternalFrame {

    public JComboBox box;
    public JLabel lblB;
    Container c;
    public JPanel panelB, panelB2;
    public JFrame fb;
    String array[] = {"jakarta", "bandung", "surabaya"};
    public Icon gambar[] = {new ImageIcon("./image/jakarta.jpg"),
        new ImageIcon("./image/bandung.jpg" ),
        new ImageIcon("./image/surabaya.jpg")};
    private controlBox cb;

    public internalBox() {
        super("Internal Chaeck Box", true, true, true, true);
        c = getContentPane();
        panelB = new JPanel();
        panelB2 = new JPanel();
        fb = new JFrame();

        c.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));

        cb = new controlBox(this);
        
        box = new JComboBox(array);
        box.setMaximumRowCount(3);
        box.addItemListener(cb);
        panelB.add(box);
        c.add(panelB);

        lblB = new JLabel();
        panelB.add(lblB);

        this.setResizable(false);
        setSize(350,200);
        show();

    }

}
