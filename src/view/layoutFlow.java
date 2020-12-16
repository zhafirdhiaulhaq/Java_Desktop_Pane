/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.controlBtnReal;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author zhafir
 */
public class layoutFlow extends JInternalFrame{
    public JButton btn1,btn2,btn3;
    public JFrame f;
    public JPanel panel;

    public layoutFlow() {
        super("FlowLayout",true, true, true, true);
        f= new JFrame();
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT,30,10));
      
        btn1 = new JButton("button1");
        panel.add(btn1);
        
        btn2 = new JButton("button2");
        panel.add(btn2);
        
        btn3 = new JButton("button3");
        panel.add(btn3);

        this.add(panel);
        setSize(300, 100);
        show();

    }
}
