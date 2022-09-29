import java.util.Scanner;

public class ZCalculatrice {
    public static void main(String[] args) {
        int som, add, sous, multi, diff;
        int nbre1, nbre2;
        Scanner sc = new Scanner(System.in);
        char reponse = ' ', mode = ' ';
        System.out.println("******************************************");
        System.out.println("Operation  dans R");
        System.out.println("******************************************");
        do {
            System.out.println("1_Addition");
            System.out.println("2_Soustration");
            System.out.println("3_Multiplication");
            System.out.println("4_Division");
            do {
                System.out.println("Choisissez l'opreation :");
                mode = sc.nextLine().charAt(0);
                if (mode != '1' && mode != '2' && mode != '3')
                    System.out.println("Mode inconnu, veuillez réitérer votre choix.");
            } while (mode != '1' && mode != '2' && mode != '3');
            System.out.print("Nombre 1 : ");
            nbre1 = sc.nextInt();
            System.out.print("Nombre 2 : ");
            nbre2 = sc.nextInt();
            if (mode == '1') {
                System.out.println("***********Addition***********");
                som = nbre1 + nbre2;
                System.out.println(nbre1 + "+" + nbre2 + "=" + som);
            }
            if (mode == '2') {
                System.out.println("***********Soustration***********");
                sous = nbre1 - nbre2;
                System.out.println(nbre1 + "-" + nbre2 + "=" + sous);

            }
            if (mode == '3') {
                System.out.println("***********Multiplication***********");
                multi = nbre1 * nbre2;
                System.out.println(nbre1 + "*" + nbre2 + "=" + multi);

            }
            if (mode == '4') {
                System.out.println("***********Division***********");
                diff = nbre1 / nbre2;
                System.out.println(nbre1 + "/" + nbre2 + "=" + diff);

            }
            sc.nextLine();
            do {
                System.out.println("Souhaitez-vous continuez ? (O/N) : ");
                reponse = sc.nextLine().charAt(0);
                if (reponse != 'O' && reponse != 'N')
                    System.out.println("Choix non disponible ");
            } while (reponse != 'O' && reponse != 'N');

        } while (true);
    }
}