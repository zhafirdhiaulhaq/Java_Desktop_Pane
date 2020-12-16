package view;

import controller.controlBtnReal;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import javax.swing.*;


public class internalButton extends JInternalFrame {

    public JButton btn;
    public JFrame f;
    public JPanel panel;
    private controlBtnReal br;

    public internalButton() {
        super("Internal Button",true, true, true, true);
        f= new JFrame();
        panel= new JPanel();
        
        f.setLayout(new FlowLayout(FlowLayout.TRAILING));
        
        br = new controlBtnReal(this);
        btn = new JButton("CLICK ME !");
        btn.addActionListener(br);
        panel.add(btn);
        

        this.add(panel);
        setSize(200, 120);
        show();

    }

}
