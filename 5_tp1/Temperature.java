import java.util.Scanner;

public class Temperature {

    public Temperature() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double temperature, convertit;
        char reponse = ' ', mode = ' ';
        Scanner sc = new Scanner(System.in);
        do {
            do {
                System.out.println("***********************************************");
                System.out.println("CONVERSION TEMPERATURE CELSUIS - FHARENEHT");
                System.out.println("1_CELSUIS - FHARENEHT");
                System.out.println("2_FHARENEHT - CELSUIS");
                System.out.println("Votre : ");
                mode = sc.nextLine().charAt(0);
                if (mode != '1' && mode != '2') {
                    System.out.println("Choix non disponible ");
                }
            } while (mode != '1' && mode != '2');
            System.out.println("Entrez la temperature : ");
            temperature = sc.nextDouble();
            do {
                System.out.printf("Voulez vous continuer O/N ");
                sc.nextLine();
                reponse = sc.nextLine().charAt(0);
                // reponse = reponse.toUpperCase();
                if (reponse != 'O' & reponse != 'N') {
                    System.out.println("Taper O pour continuer");
                    System.out.println("Taper N pour quitter");
                }
            } while (reponse != 'O' & reponse != 'N');
        } while (reponse == 'O');
        // Fin de programme
        System.out.println("Au revoir ! ");
    }

}
