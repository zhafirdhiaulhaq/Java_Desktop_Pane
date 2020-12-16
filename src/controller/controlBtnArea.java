
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.internalArea;

public class controlBtnArea implements ActionListener {

    private internalArea iArea;

    public controlBtnArea(internalArea iArea) {
        this.iArea = iArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        iArea.area2.setText(iArea.area1.getSelectedText());
    }

}
