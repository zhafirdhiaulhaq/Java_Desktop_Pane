package view;

import controller.controlBtnField;
import controller.controlBtnField2;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.*;


public class internalField extends JInternalFrame {

    public JTextField txt;
    public JButton btnOn,btnOff;
    public JFrame f;
    public JPanel panel,panel2;
    Container c = getContentPane();
    private controlBtnField bf;
    private controlBtnField2 bf2;

    public internalField() {
        super("Internal Text Field",true, true, true, true);
        f= new JFrame();
        panel= new JPanel();
        panel2= new JPanel();
        bf = new controlBtnField(this);
        bf2 = new controlBtnField2(this);
        
        c.setLayout(new GridLayout(2,1));
        panel.setLayout(new FlowLayout(FlowLayout.TRAILING));
        
        txt = new JTextField(15);
        txt.setText("not editble");
        txt.setEditable(false);
        panel.add(txt);
        c.add(panel);

        panel2.setLayout(new FlowLayout(FlowLayout.LEFT,30,0));
        btnOn= new JButton("ON");
        btnOn.addActionListener(bf);
        panel2.add(btnOn);
        
        btnOff= new JButton("OFF");
        btnOff.addActionListener(bf2);
        panel2.add(btnOff);
        c.add(panel2);

        setSize(200, 120);
        show();

    }

}
