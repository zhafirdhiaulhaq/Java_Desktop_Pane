package view;

import controller.controlBtnPass;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.*;

public class internalPass extends JInternalFrame {

    public JPasswordField pass;
    public JLabel lblP;
    public JPanel panelP,panelP2;
    public JButton btnLogin;
    public JFrame fp;
    private controlBtnPass bp;
    Container c =getContentPane();

    public internalPass() {
        super("Internal Chaeck Box",true, true, true, true);
        
        panelP= new JPanel();
        panelP2= new JPanel();
        fp= new JFrame();
        
        c.setLayout(new GridLayout(2,1));
        
        panelP.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        lblP = new JLabel("TULIS PASSWORD DENGAN BENAR");
        panelP.add(lblP);
        c.add(panelP);
        
        panelP2.setLayout(new FlowLayout(FlowLayout.CENTER,30,0));
        
        pass = new JPasswordField(15);
        pass.setEditable(true);
        panelP2.add(pass);
        
        bp = new controlBtnPass(this);
        btnLogin = new JButton("LOGIN");
        btnLogin.addActionListener(bp);
        panelP2.add(btnLogin);
        c.add(panelP2);

        this.setResizable(false);
        setSize(300, 120);
        show();

    }

}
