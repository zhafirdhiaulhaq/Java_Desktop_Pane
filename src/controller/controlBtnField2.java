
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.internalField;


public class controlBtnField2 implements ActionListener{
    private internalField iField2;

    public controlBtnField2(internalField iField2) {
        this.iField2 = iField2;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        iField2.txt.setEditable(false);
    }
    
}
