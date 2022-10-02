import javax.swing.JFrame ;

public class Fenetre extends JFrame{
    public Fenetre(){
        this.setVisible(true) ;
        this.setSize(400,200);
        Panneau pn = new Panneau();
        this.setContentPane(pn);
    }
}