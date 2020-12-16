package view;

import controller.controlRadio;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.*;

public class internalRadio extends JInternalFrame {

    public JRadioButton rad1,rad2,rad3;
    public JTextField text;
    public JPanel panelR,panelR2;
    public JFrame fr;
    private controlRadio cr;
    
    Container c = getContentPane();

    public internalRadio() {
        super("Internal RadioButton",true, true, true, true);
        
        panelR= new JPanel();
        panelR2= new JPanel();
        fr= new JFrame();
        
        c.setLayout(new GridLayout(2,1));
        
        panelR.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        text = new JTextField(15);
        text.setText("Jenis kelamin");
        text.setEditable(false);
        panelR.add(text);
        c.add(panelR);

        panelR2.setLayout(new FlowLayout(FlowLayout.CENTER));
        cr= new controlRadio(this);
        
        rad1 = new JRadioButton("Pria");
        rad1.addItemListener(cr);
        panelR2.add(rad1);
        
        rad2 = new JRadioButton("Wanita");
        panelR2.add(rad2);
        rad2.addItemListener(cr);
        
        rad3 = new JRadioButton("Rahasia");
        panelR2.add(rad3);
        rad3.addItemListener(cr);
        
        ButtonGroup x =new ButtonGroup();
        x.add(rad1);
        x.add(rad2);
        x.add(rad3);
        c.add(panelR2);
        
//        this.add(panelR);
        this.setResizable(false);
        setSize(300, 120);
        show();

    }

}
