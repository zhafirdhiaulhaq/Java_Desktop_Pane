
package view;

import controller.controlList;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.DefaultListModel;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;


public class internalList extends JInternalFrame{

    public JList list,list2;
    public JLabel lbl;
    public JPanel panel,panel2,panel3;
    private String isi[]={"budi","randy","lidya"};
    private String isi2[]={"Sistem Informasi","Teknik Industri","Teknik Logistik"};
    Container c;
    private controlList cl;
    public internalList() {
         super("Internal List",true,true,true,true);
         c = getContentPane();
         
         c.setLayout(new GridLayout(2,1));
         cl= new controlList(this);
    
         panel = new JPanel();
         panel.setLayout(new FlowLayout(FlowLayout.CENTER));
         list = new JList(isi);
//         list.addListSelectionListener(cl);//jgn disini, tar ga kepanggil
         panel.add(list);
         
         list2 = new JList(isi2);
//         list2.addListSelectionListener(cl);//jgn disini tar ga kepanggil
         panel.add(list2);
         
         list.setSelectedIndex(0);
         list2.setSelectedIndex(0);
         
         panel3 = new JPanel();
         panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
         lbl = new JLabel();
         lbl.setText(list.getSelectedValue().toString() + " - " +list2.getSelectedValue().toString());
         panel3.add(lbl);
         
         //alasan panggil sini biar ga kena setText atas tu
         list.addListSelectionListener(cl);
         list2.addListSelectionListener(cl);
         
         c.add(panel);
         c.add(panel3);
         
         this.setSize(200,150);
         this.setResizable(false);
         show();
    }
   
}
