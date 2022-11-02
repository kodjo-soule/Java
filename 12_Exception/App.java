import java.util.Scanner;
public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre 1 : ");
        int nbre1 = sc.nextInt();
    
        System.out.print("Nombre 2 : ");
        int nbre2 = sc.nextInt();
        System.out.println("Somme "+nbre1+"+"+nbre2+"="+somme(nbre1,nbre2));
        System.out.println("Diff "+nbre1+"/"+nbre2+"="+diff(nbre1,nbre2));
        
    }
    public static int somme(int a, int b){
        return a+b ;
    }
    public static double diff(int a, int b){
        double diff = 0 ;
        try{
            diff =  a/b ;
        }catch(ArithmeticException e){
            System.out.println("Erreur");
        }
        return diff ;
    }
}