package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class internalCustomPanel extends JInternalFrame {

    private JPanel buttonPanel;
    private CustomPanel myPanel;
    private JButton circle, square;

    public internalCustomPanel() {
        super("Internal CustomPanel", true, true, true, true);
        myPanel = new CustomPanel();
        myPanel.setBackground(Color.cyan);
        square = new JButton("Bujur Sangkar");
        square.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myPanel.draw(CustomPanel.SQUARE);
            }
        });
        circle = new JButton("Lingkaran");
        circle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myPanel.draw(CustomPanel.CIRCLE);
            }
        });
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(circle);
        buttonPanel.add(square);
        Container c = getContentPane();
        c.add(myPanel, BorderLayout.CENTER);
        c.add(buttonPanel, BorderLayout.SOUTH);
        setSize(300, 200);
        show();
    }

    private class CustomPanel extends JPanel {

        public final static int CIRCLE = 1, SQUARE = 2;
        private int shape;

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (shape == CIRCLE) {
                g.fillOval(50, 10, 60, 60);
            }
            if (shape == SQUARE) {
                g.fillRect(50, 10, 60, 60);
            }
        }

        public void draw(int s) {
            shape = s;
            repaint();
        }
    }

//    public static void main(String[] args) {
//        CustomPanelTest app = new CustomPanelTest();
//    }
}