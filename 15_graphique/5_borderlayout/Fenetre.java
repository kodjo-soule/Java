import java.awt.Color ;
import java.awt.BorderLayout ;
import javax.swing.JFrame ;
import javax.swing.JPanel ;
import javax.swing.JButton;
public class Fenetre extends JFrame{
    private JPanel pan1 = new JPanel();
    private JPanel pan2 = new JPanel();
    private JPanel pan3 = new JPanel();
    //Composant boutton
    private JButton btn1 = new JButton("BTN1");
    public Fenetre(){
        this.setVisible(true) ;
        this.setSize(400, 300);
        this.setTitle("Swing 2");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan1.setBackground(Color.yellow);
        pan2.setBackground(Color.red);
        pan3.setBackground(Color.green);
        this.setContentPane(pan1);
        this.setContentPane(pan2);
        this.setContentPane(pan3);
        //On definit le layout a utiliser sur le content pane ;
        this.setLayout(new BorderLayout());
        //Ajouter composant au content panel 
        //En bas
        pan3.add(new JButton("Prod by @Soule.Soft"), BorderLayout.SOUTH);
        // En haut
        pan3.add(new JButton("Info"), BorderLayout.NORTH);
        //Au centre
        pan3.add(new JButton("Developpeur Java"), BorderLayout.CENTER);
        //A droite ou ESt
        this.getContentPane().add(new JButton("Next"), BorderLayout.EAST);
        // A gauche ou ouest
        this.getContentPane().add(new JButton("Previous"), BorderLayout.WEST);

        //this.getContentPane().add(new JButton("NEW"));
        
        //this..add(new JButton("Kodjo"), BorderLayout.WEST);

    }
}