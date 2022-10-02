import java.util.Scanner ;
public class Switch{
    public static void main(String[] args){
        System.out.print("Entrez un nombre : ") ;
        Scanner sc = new Scanner(System.in);
        String note = sc.nextLine() ;
        switch(note){
            case "0" : System.out.print("zero");break;
            case "1" : System.out.print("un");break;
            case "2" : System.out.print("deux");break;
            case "3" : System.out.print("trois");break;
            case "4" : System.out.print("quatre");break;
            case "5" : System.out.print("cinq");break;
            case "6" : System.out.print("six");break;
            case "7" : System.out.print("sept");break;
            case "8" : System.out.print("huit");break;
            case "9" : System.out.print("neuf");break;
            default : System.out.print("Invalide") ;
        }
    }
}