import java.util.Scanner ; 
public class Tp
{
    public static void main(String[] args){
        char tableauNumber[]={'1', '2', '3', '4', '5'};
        char reponse=' ', caract=' ' ;
        Scanner sc = new Scanner(System.in); 
        int i;
        do{//Jeux
            do{
                i=0;
                System.out.println("Entrez un nombre svp : ");
                caract = sc.nextLine().charAt(0);
                while(i <tableauNumber.length && caract !=tableauNumber[i])
                {i++;}
                if(i<=tableauNumber.length)
                System.out.println("Le nombre se trouve dans le tableau ");
                else
                System.out.println("Le nombre ne se trouve pas dans le tableau");
            }while(i >= tableauNumber.length);
            do{
                System.out.println("Voulez vous esayez a nouveau ");
            }while(reponse !='O' && reponse !='N');
        }while(reponse == 'O');
    }
}