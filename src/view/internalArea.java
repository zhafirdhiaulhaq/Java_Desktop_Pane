/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.controlBtnArea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author zhafir
 */
public class internalArea extends JInternalFrame {

    public JTextArea area1;
    public JTextArea area2;
    private JButton btn;
    private controlBtnArea a;

    public internalArea() {
        super("Internal Text Area",true, true, true, true);
        Box b = Box.createHorizontalBox();
        String s = "sistem informasi";
        
        area1 = new JTextArea(s, 10, 15);
        b.add(new JScrollPane(area1));
        
        a = new controlBtnArea(this);
        btn = new JButton("COPY");
        btn.addActionListener(a);
        b.add(btn);
        
        area2 = new JTextArea(10, 15);
        area2.setEnabled(false);
        b.add(new JScrollPane(area2));
        
        this.getContentPane().add(b);
        setSize(300, 300);
        show();

    }
}
