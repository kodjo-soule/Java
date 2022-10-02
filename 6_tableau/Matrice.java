import java.util.Scanner ;
public class Matrice{
    public static void main(String[] args){
        // final int MAX = 20 ;
        // int matrice[][] = new int[MAX][MAX] ;
        int ligne,colonne ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de Ligne : ");
        ligne = sc.nextInt() ;
        System.out.print("Entrez le nombre de colonne : ");
        colonne = sc.nextInt();
        int matrice[][] = new int[ligne][colonne] ;
        System.out.println("**********insertion des element du Matrice*************");
        for(int i=0 ; i< ligne ; i++){
            for (int j=0 ; j < colonne ; j++){
                System.out.print("M["+i+"]"+"["+j+"] = ");
                matrice[i][j] =sc.nextInt();
            }
        }
        System.out.println("**********Affichage des element du Matrice*************");
        for(int i=0 ; i< ligne ; i++){
            for (int j=0 ; j < colonne ; j++){
                System.out.print("\t"+matrice[i][j]);
            }
            System.out.print("\n");
        }

        // for(int[] t : matrice){
        //     for(int l : t){
        //         System.out.println(l);
        //     }
        // }
    }
}