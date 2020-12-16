
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.internalField;


public class controlBtnField implements ActionListener{
    private internalField iField;

    public controlBtnField(internalField iField) {
        this.iField = iField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        iField.txt.setEditable(true);
    }
    
}
