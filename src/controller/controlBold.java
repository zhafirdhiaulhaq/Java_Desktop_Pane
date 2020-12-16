package controller;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import view.internalBold;

public class controlBold implements ItemListener {

    private internalBold iBold;
    private int valBold = Font.PLAIN;
    private int valItalic = Font.PLAIN;
    

    public controlBold(internalBold iBold) {
        this.iBold = iBold;
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()== iBold.check) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                valBold = Font.BOLD;
            }else{
                valBold = Font.PLAIN;
            }
        }else if(e.getSource()== iBold.check2){
            if (e.getStateChange() == ItemEvent.SELECTED) {
                valItalic = Font.ITALIC;
            }else{
                valItalic = Font.PLAIN;
            }
        }
       // cbt.txt.setFont(new Font("TimesRoman" , valBold + valItalic,12)));
        iBold.txtF.setFont(new Font ("TimesRoman", valBold + valItalic, 12));
        iBold.txtF.repaint();
    }
    
}
