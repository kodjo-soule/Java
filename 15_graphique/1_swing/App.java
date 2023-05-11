import javax.swing.JFrame ;
public class App{
    public static void main(String[] args){
        JFrame fenetre = new JFrame() ;
        System.out.println("Hello world");
        fenetre.setVisible(true) ;
        fenetre.setTitle("Liste d'admis") ;
        fenetre.setSize(400,100) ;
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
    }
}