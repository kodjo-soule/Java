import java.awt.Color ;
import java.awt.GridLayout ;
import javax.swing.JFrame ;
import javax.swing.JPanel ;
import javax.swing.JButton;
public class Fenetre extends JFrame{
    private JPanel pan = new JPanel();
    //Composant boutton
    private JButton btn1 = new JButton("BTN1");
    public Fenetre(){
        this.setVisible(true) ;
        this.setSize(500, 400);
        this.setResizable(false);
        this.setTitle("Swing 2");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan.setBackground(Color.yellow);
        this.setContentPane(pan);
        //Ajouter composant au content panel 
        GridLayout gl = new GridLayout();
        gl.setColumns(3);
        gl.setRows(4);
        gl.setHgap(5);
        gl.setVgap(5);
        this.setLayout(gl);
        this.getContentPane().add(new JButton("1"));
        this.getContentPane().add(new JButton("2"));
        this.getContentPane().add(new JButton("3"));
        this.getContentPane().add(new JButton("4"));
        this.getContentPane().add(new JButton("5"));
        this.getContentPane().add(new JButton("6"));
        this.getContentPane().add(new JButton("7"));
        this.getContentPane().add(new JButton("8"));
        this.getContentPane().add(new JButton("9"));
        this.getContentPane().add(new JButton("0"));
        this.getContentPane().add(new JButton("<="));
        this.getContentPane().add(new JButton("="));
        
    }
}