import java.util.Scanner;

class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float montante, montantConvertie;
        char reponse = ' ', mode = ' ';
        do {
            System.out.println("************** Conversion Euro/FCFA XOF ******************");
            System.out.println("1____________Convertisuer Euro/FCFA___________________");
            System.out.println("2____________Convertisuer FCFA/Euro___________________");
            do {
                System.out.print("Votre choix : ");
                mode = sc.nextLine().charAt(0);
                if (mode != '1' && mode != '2') {
                    System.out.println("Choix non disponible");
                    System.out.println("1____________Convertisuer Euro/FCFA___________________");
                    System.out.println("2____________Convertisuer FCFA/Euro___________________");
                }

            } while (mode != '1' && mode != '2');
            System.out.print("Montant a convertir : ");
            montante = sc.nextFloat();
            if (mode == '1') {
                montantConvertie = montante * 655;
                System.out.println(montante + "Euro ----> " + montantConvertie + "FCFA");
            }
            if (mode == '2') {
                montantConvertie = montante / 655;
                System.out.println(montante + "FCFA ----> " + montantConvertie + "Euro");
            }
            sc.nextLine();
            do {
                System.out.print("Voulez vous recommencez (O/N)");
                reponse = sc.nextLine().charAt(0);
                if (reponse != 'O' && reponse != 'N') {
                    System.out.println("Choix invalide");
                }
            } while (reponse != 'O' && reponse != 'N');
        } while (reponse == 'O');
    }
}