
package controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import view.internalRadio;


public class controlRadio implements ItemListener{
    private internalRadio iRad;

    public controlRadio(internalRadio iRad) {
        this.iRad = iRad;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (iRad.rad1.isSelected()) {
            iRad.text.setText("Jenis kelamin = " + iRad.rad1.getActionCommand());
        }else if (iRad.rad2.isSelected()) {
            iRad.text.setText("Jenis kelamin = " + iRad.rad2.getActionCommand());
        }else if(iRad.rad3.isSelected()){
            iRad.text.setText("Jenis kelamin = " + iRad.rad3.getActionCommand());
        }
    }
 
    
}
