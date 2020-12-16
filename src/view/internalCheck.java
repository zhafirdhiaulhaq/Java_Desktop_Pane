package view;

import controller.controlCheck;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.*;

public class internalCheck extends JInternalFrame {

    public JCheckBox check,check2,check3;
    public JLabel lblC;
    public JPanel panelC, panelC2;
    public JFrame fc;
    private controlCheck vck;
    Container c = getContentPane();

    public internalCheck() {
        super("Internal Check Box",true, true, true, true);
        
        panelC= new JPanel();
        panelC2= new JPanel();
        fc= new JFrame();
        
        c.setLayout(new GridLayout(2,1));
        
        panelC.setLayout(new FlowLayout(FlowLayout.LEFT,30,0));
        
        vck = new controlCheck(this);
        
        check = new JCheckBox("kerja");
        panelC.add(check);
        check.addItemListener(vck);
        
        check2 = new JCheckBox("kuliah");
        panelC.add(check2);
        check2.addItemListener(vck);
        c.add(panelC);
        
        panelC2.setLayout(new FlowLayout(FlowLayout.CENTER));
        lblC = new JLabel("Status =      ");
        panelC2.add(lblC);
        
        c.add(panelC2);
//        lblC.addItemListener(vck);
        
//        this.add(panelC);
        this.setResizable(false);
        setSize(200, 120);
        show();

    }

}
