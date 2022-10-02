import java.awt.Color ;
import java.awt.GridLayout ;
import java.awt.BorderLayout ;
import javax.swing.BoxLayout ;
import java.awt.FlowLayout ;
import javax.swing.JFrame ;
import javax.swing.JPanel ;
import javax.swing.JButton;
public class Fenetre extends JFrame{
    private JPanel pan = new JPanel();
    private JPanel header = new JPanel();
    private JPanel content = new JPanel();
    private JPanel menu = new JPanel();
    //Composant boutton
    private JButton btn1 = new JButton("BTN1");
    public Fenetre(){
        this.setVisible(true) ;
        this.setSize(400, 300);
        this.setTitle("Swing 2");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan.setBackground(Color.yellow);
        pan.setLayout(new GridLayout(4,3,5,3));
        this.setContentPane(content);
        this.content.setLayout(new BorderLayout());
        //Ajouter composant au content panel 
        // this.header.setLayout(new BorderLayout());
        this.header.add(new JButton("Ajouter")) ;
        this.header.add(new JButton("Retirer"));
        this.header.setBackground(Color.red);
        // this.getContentPane().add(new JButton("1"));
        // this.getContentPane().add(new JButton("2"));
        // this.getContentPane().add(new JButton("3"));
        // this.getContentPane().add(new JButton("4"));
        // this.getContentPane().add(new JButton("5"));
        // this.getContentPane().add(new JButton("6"));
        // this.getContentPane().add(new JButton("7"));
        // this.getContentPane().add(new JButton("8"));
        // this.getContentPane().add(new JButton("9"));
        // this.getContentPane().add(new JButton("0"));
        this.content.add(header, BorderLayout.NORTH);
        menu.setLayout(new BoxLayout(menu, BoxLayout.PAGE_AXIS));
        menu.add(new JButton("Accueill"));
        menu.add(new JButton("Liste"));
        this.content.add(menu, BorderLayout.WEST);
        this.pan.add(new JButton("1"));
        this.pan.add(new JButton("2"));
        this.pan.add(new JButton("3"));
        this.pan.add(new JButton("4"));
        this.pan.add(new JButton("5"));
        this.pan.add(new JButton("6"));
        this.pan.add(new JButton("7"));
        this.pan.add(new JButton("8"));
        this.pan.add(new JButton("9"));
        this.pan.add(new JButton("0"));
        this.pan.add(new JButton("<="));
        this.pan.add(new JButton("="));
        this.content.add(pan, BorderLayout.CENTER);
    }
}