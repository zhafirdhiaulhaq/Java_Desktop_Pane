package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.internalPop;
        
public class controlPop implements ActionListener {

    public internalPop iPop;
    
    public controlPop (internalPop iPop){
        this.iPop = iPop;
    }
    
    @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < iPop.items.length; i++) {
                if (e.getSource() == iPop.items[i]) {
                    iPop.getContentPane().setBackground(iPop.colorValues[i]);
                    iPop.repaint();
                }
            }
        }
    }