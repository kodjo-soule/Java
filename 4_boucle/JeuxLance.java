import java.util.Scanner;
public class JeuxLance{
    public static void main(String[] args)
    {
        boolean jeux_lance = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Commande*******");
        int age = 3 ;
        if (age == 33){
            System.out.println("OK") ;
        }
        while(jeux_lance == true){
            System.out.print(">");
            String cmd ;
            cmd = sc.nextLine();
            System.out.println(cmd);
            String a = "11" ;
            if ( cmd ==  a){
                System.out.println("COCOCOCOCO") ;
            }
        }
    }
}