import java.util.Scanner ;
public class Lecture{
    public static void main(String[] args){
        System.out.print("Entrez un nombre : ") ;
        Scanner sc = new Scanner(System.in);
        int a ;
        a = sc.nextInt() ;
        System.out.println("Nombre Saisi : "+ a);
        System.out.print("Entrez une phrase : ");
        //On vide la chaine
        sc.nextLine() ;
        String phrase = sc.nextLine();
        System.out.println("Phrase saisi : "+ phrase) ;
        System.out.println("FIN !") ;
    }
}