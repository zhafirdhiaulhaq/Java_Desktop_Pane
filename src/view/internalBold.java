package view;

//import controller.controlCheck;
import controller.controlBold;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.*;

public class internalBold extends JInternalFrame {

    public JCheckBox check,check2;
    public JTextField txtF;
    public JPanel panelI, panelI2;
    public JFrame fc;
    private controlBold bld;
    Container c = getContentPane();

    public internalBold() {
        super("Internal Bold/Italic",true, true, true, true);
        
        panelI= new JPanel();
        panelI2= new JPanel();
        fc= new JFrame();
        
        c.setLayout(new GridLayout(2,1));
        
        panelI.setLayout(new FlowLayout(FlowLayout.LEFT,30,0));
        
        bld = new controlBold(this);
        
        check = new JCheckBox("Bold");
        panelI.add(check);
        check.addItemListener(bld);
        
        check2 = new JCheckBox("Italic");
        panelI.add(check2);
        check2.addItemListener(bld);
        c.add(panelI);
        
        panelI2.setLayout(new FlowLayout(FlowLayout.CENTER));
        txtF = new JTextField(15);
        txtF.setText("Sistem Informasi-42-09");
        txtF.setEditable(false);
        panelI2.add(txtF);
        
        c.add(panelI2);
//        lblC.addItemListener(vck);
        
//        this.add(panelC);
        this.setResizable(false);
        setSize(200, 120);
        show();

    }

}
