import java.awt.Color ;
import javax.swing.JFrame ;
import javax.swing.JPanel ;
public class Fenetre extends JFrame{
    public Fenetre(){
        this.setVisible(true) ;
        this.setSize(400, 300);
        this.setTitle("Swing 2");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pan = new JPanel();
        pan.setBackground(Color.GREEN);

        this.setContentPane(pan);
    }
}