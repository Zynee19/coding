import javax.swing.JFrame;
public class JFrame1{
    public static void main(String[]args){
        JFrame z= new JFrame();
        z.setResizable(false);
        z.setSize(500,500);
        z.setLocationRelativeTo(null);        
        z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        z.setVisible(true);
    }
}