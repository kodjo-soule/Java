import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int i = 0;
        // String nom[] = { "nom" };
        int ages[];
        Scanner sc = new Scanner(System.in);
        // while (i < 10) {
        System.out.print("Entrez votre nom : ");
        // nom[i] += sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Nom : " + name);
        sc.nextLine();
        i++;
        // }
    }
}
