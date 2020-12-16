
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.internalButton;


public class controlBtnReal implements ActionListener{
    private internalButton iButt;

    public controlBtnReal(internalButton iButt) {
        this.iButt= iButt;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(iButt, "kamu abis clik button ya", "Message",0);
    }
    
}
