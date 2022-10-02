public class Methode2{
    public static void main(String[] args){
        direSalut();
        System.out.println("14+4="+somme(14,4));
        int double1=dbl(25);
        System.out.println("Double :"+ double1);
    }
    public static void direSalut(){
        System.out.println("Salut, Cest comment ?");
    }
    public static int somme(int a, int b){
        return a+b ;
    }public static int dbl(int nb0 ){
		return nb0*2;
	}
}