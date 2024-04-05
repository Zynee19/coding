import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class JPanel1 {
   public static void main(String[]args){
    JFrame z= new JFrame();
    z.setTitle("GUI");
    z.setResizable(false);
        z.setSize(450,450);
        z.setLocationRelativeTo(null);        
        z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        z.setVisible(true); 
        z.setLayout(null); 

    JPanel panel = new JPanel();
    panel.setBackground(new Color(0x8357F7));
    panel.setSize(450,450);
    panel.setBounds(0,0,450,450);
    z.add(panel);
   } 
}
