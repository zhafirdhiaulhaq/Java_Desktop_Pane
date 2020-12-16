package controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import view.internalCheck;

public class controlCheck implements ItemListener {

    private internalCheck ck;

    public controlCheck(internalCheck ck) {
        this.ck = ck;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        if (ck.check.isSelected() && ck.check2.isSelected()) {
            ck.lblC.setText("status anda "+ck.check.getActionCommand() +" & "+ ck.check2.getActionCommand());
        }else if (ck.check.isSelected()) {
            ck.lblC.setText("Status anda kerja");
//            ck.lblC.setText(ck.check.getActionCommand());
        } else if (ck.check2.isSelected()) {
            ck.lblC.setText("Status anda kuliah");
        
        } else {
            ck.lblC.setText("Status =      ");
        }

    }

}
