package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class desktopTest extends JFrame {
//pop-up,jlist,jtable,toolbar
    public desktopTest() {
        final JDesktopPane desktop = new JDesktopPane();
        this.getContentPane().add(desktop);
        
        this.setTitle("TUBES OOP-JdesktopPane");
        JMenuBar bar = new JMenuBar();
        JMenu addMenu = new JMenu("Componen");
        JMenu addMenu2 = new JMenu("Layout");
        
        //==================================================
        JMenuItem newLay3 = new JMenuItem("BorderLayout");
        addMenu2.add(newLay3);
        newLay3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layoutBorder lay3 = new layoutBorder();
                desktop.add(lay3);
                lay3.setVisible(true);
            }
        });
        
        //==================================================
        JMenuItem newLay2 = new JMenuItem("GridLayout");
        addMenu2.add(newLay2);
        newLay2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layoutGrid lay2 = new layoutGrid();
                desktop.add(lay2);
                lay2.setVisible(true);
            }
        });
        //==================================================
        JMenuItem newLay = new JMenuItem("FlowLayout");
        addMenu2.add(newLay);
        newLay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layoutFlow lay = new layoutFlow();
                desktop.add(lay);
                lay.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame = new JMenuItem("Text Area");
        addMenu.add(newFrame);
        newFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalArea frm = new internalArea();
                desktop.add(frm);
                frm.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame2 = new JMenuItem("Text Field");
        addMenu.add(newFrame2);
        newFrame2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalField frm2 = new internalField();
                desktop.add(frm2);
                frm2.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame3 = new JMenuItem("Password");
        addMenu.add(newFrame3);
        newFrame3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalPass frm3 = new internalPass();
                desktop.add(frm3);
                frm3.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame4 = new JMenuItem("Combo Box");
        addMenu.add(newFrame4);
        newFrame4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalBox frm4 = new internalBox();
                desktop.add(frm4);
                frm4.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame5 = new JMenuItem("Check Box");
        addMenu.add(newFrame5);
        newFrame5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalCheck frm5 = new internalCheck();
                desktop.add(frm5);
                frm5.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame6 = new JMenuItem("Pop-Up");
        addMenu.add(newFrame6);
        newFrame6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalPop frm6 = new internalPop();
                desktop.add(frm6);
                frm6.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame7 = new JMenuItem("Bold-Italic");
        addMenu.add(newFrame7);
        newFrame7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalBold frm7 = new internalBold();
                desktop.add(frm7);
                frm7.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame8 = new JMenuItem("Radio Button");
        addMenu.add(newFrame8);
        newFrame8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalRadio frm8 = new internalRadio();
                desktop.add(frm8);
                frm8.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame9 = new JMenuItem("Button");
        addMenu.add(newFrame9);
        newFrame9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalButton frm9 = new internalButton();
                desktop.add(frm9);
                frm9.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame10 = new JMenuItem("List");
        addMenu.add(newFrame10);
        newFrame10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalList frm10 = new internalList();
                desktop.add(frm10);
                frm10.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame11 = new JMenuItem("Table");
        addMenu.add(newFrame11);
        newFrame11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalTable frm11 = new internalTable();
                desktop.add(frm11);
                frm11.setVisible(true);
            }
        });
        
        //======================================================
        JMenuItem newFrame12 = new JMenuItem("CustomPanel");
        addMenu.add(newFrame12);
        newFrame12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalCustomPanel frm12 = new internalCustomPanel();
                desktop.add(frm12);
                frm12.setVisible(true);
            }
        });
        
        //======================================================
        bar.add(addMenu);
        bar.add(addMenu2);
        setJMenuBar(bar);

        this.setSize(900, 400);
        show();
    }//==

    public static void main(String[] args) {
        desktopTest app = new desktopTest();
        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
//            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(desktopTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desktopTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desktopTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desktopTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }
}
