package view;

import Controller.controlPop;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JInternalFrame;
import javax.swing.*;

public class internalPop extends JInternalFrame {

    public JCheckBox check, check2, check3;
    public JLabel lblC;
    public JPanel panelC;
    public JFrame fc;

    private controlPop mt;
    public JRadioButtonMenuItem items[];
    public Color colorValues[] = {Color.blue, Color.yellow, Color.red};

    public internalPop() {
        super("Internal Pop-up",true, true, true, true);
        final JPopupMenu popupMenu = new JPopupMenu();

        lblC = new JLabel("coba kamu klik kanan dimana aja");
        this.add(lblC);

        mt = new controlPop(this);
        String colors[] = {"Biru", "Kuning", "Merah"};
        ButtonGroup colorGroup = new ButtonGroup();
        items = new JRadioButtonMenuItem[3];

        for (int i = 0; i < items.length; i++) {
            items[i] = new JRadioButtonMenuItem(colors[i]);
            popupMenu.add(items[i]);
            colorGroup.add(items[i]);
            items[i].addActionListener(mt);//==========
        }
        getContentPane().setBackground(Color.gray);
        addMouseListener(
                new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                checkForTriggerEvent(e);
            }

            public void mouseReleased(MouseEvent e) {
                checkForTriggerEvent(e);
            }

            public void checkForTriggerEvent(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        }
        );
        setSize(300, 300);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        show();
    }

}
