import java.awt.Color ;
import javax.swing.JFrame ;
import javax.swing.JPanel ;
import javax.swing.JButton;
public class Fenetre extends JFrame{
    private JPanel pan = new JPanel();
    //Composant boutton
    private JButton btn1 = new JButton("BTN1");
    public Fenetre(){
        this.setVisible(true) ;
        this.setSize(400, 300);
        this.setTitle("Swing 2");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan.setBackground(Color.yellow);
        this.setContentPane(pan);
        //Ajouter composant au content panel 
        pan.add(btn1) ;
        
    }
}