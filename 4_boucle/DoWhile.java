import java.util.Scanner;
public class DoWhile
{
    public static void main(String[] args)
    {
        String prenom ;
        char reponse = ' ';
        do
        {   
            
            // char reponse = 'O'
            Scanner sc= new Scanner(System.in);
            System.out.print("Donnez un prenom : ");
            prenom = sc.nextLine();
            System.out.println("Bonjour "+prenom+", comment vas-tu ?");
            do{
                
                System.out.println("Voulez-vous reessayer ? (O/N)");
                reponse = sc.nextLine().charAt(0);
                if(reponse != 'O' && reponse != 'N'){
                     System.out.println("Choix invalide");
                 }
            }while(reponse !='O' && reponse !='N');
            
        }while(reponse == 'O');
        System.out.println("Au revoir...");
    }
}