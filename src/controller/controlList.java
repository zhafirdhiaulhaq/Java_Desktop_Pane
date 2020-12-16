
package controller;

import java.awt.event.ItemEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import view.internalList;


public class controlList implements ListSelectionListener{
    private internalList iList;

    public controlList(internalList iList) {
        this.iList = iList;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String a = iList.list.getSelectedValue().toString();
        String b = iList.list2.getSelectedValue().toString();
        iList.lbl.setText(a +" - " + b);
    }
    
    
}
