
package controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import view.internalBox;


public class controlBox implements ItemListener{
    private internalBox iBox;

    public controlBox(internalBox iBox) {
        this.iBox = iBox;
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        iBox.lblB.setIcon(iBox.gambar[iBox.box.getSelectedIndex()]);
    }
    
}
