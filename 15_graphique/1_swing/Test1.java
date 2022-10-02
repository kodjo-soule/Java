import javax.swing.JFrame;
public class Test1{
    public static void main(String[] args){
        JFrame fn = new JFrame();
        fn.setVisible(true);
        fn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fn.setSize(600,600);
        fn.setLocationRelativeTo(null);
        fn.setTitle("KD Tech");
        fn.setResizable(false);
        fn.setAlwaysOnTop(true);
    }
}