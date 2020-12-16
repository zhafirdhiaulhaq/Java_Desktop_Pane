
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class layoutBorder extends JInternalFrame {
    
    public layoutBorder() {
        super("BorderLayout",true,true,true,true);
        Container cnt = getContentPane();
        cnt.add(new JButton("Hide North"), BorderLayout.NORTH);
        cnt.add(new JButton("Hide south"), BorderLayout.SOUTH);
        cnt.add(new JButton("Hide west"), BorderLayout.WEST);
        cnt.add(new JButton("Hide east"), BorderLayout.EAST);
        cnt.add(new JButton("Hide center"), BorderLayout.CENTER);
        
        this.setSize(300,200);
        this.setVisible(true);
    }
}
