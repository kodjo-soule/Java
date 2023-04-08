import java.io.File ;
import java.util.Scanner ;
import java.util.Formatter ;

public class Ficher2 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            Scanner sc = new Scanner(file);
            Formatter fc = new Formatter("test3.txt");
            //
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (Exception e) {
            System.out.println(e);
            //System.out.println("Okay");
        }
        
        
    }
}
