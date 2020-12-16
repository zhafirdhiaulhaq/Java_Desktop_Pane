
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.internalPass;


public class controlBtnPass implements ActionListener{
    private internalPass iPass;

    public controlBtnPass(internalPass iPass) {
        this.iPass = iPass;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (iPass.pass.getText().equalsIgnoreCase("benar")) {
            JOptionPane.showMessageDialog(iPass, "kamu Berhasil Login", "Login Message",0);
        }else{
            JOptionPane.showMessageDialog(iPass, "kamu Gagal Login", "Login Message",0);
        }
        
    }
    
}
