import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
public class JLabel1 {
   public static void main(String[]args){   
    JLabel LoginLabel =new JLabel(); 
    LoginLabel.setText("LOGIN");
    LoginLabel.setBounds(150,-80,250,250);
    LoginLabel.setFont(new Font("ARIEL",Font.BOLD,30));
    LoginLabel.setBackground(Color.BLACK);

    JLabel UserName= new JLabel();
    UserName.setText("Username: ");
    UserName.setBounds(50,-25,250,250);
   
    JLabel Password= new JLabel();
    Password.setText("Password: ");
    Password.setBounds(50,35,250,250);

    JPanel panel= new JPanel();
    panel.setBounds(0,0,450,450);
    panel.setBackground(Color.pink);
    panel.setLayout(null);

    JFrame frame= new JFrame();
    frame.setSize(400,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setLayout(null);

    panel.add(LoginLabel);
    panel.add(UserName);
    panel.add(Password);
    frame.add(panel);
   } 
}
