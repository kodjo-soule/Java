public class App{
    public static void main(String[] args) {
        Voiture bmw = new Voiture() ;
        System.out.println(bmw.getMarque());
        bmw.setMarque("okkk") ;
        System.out.println(bmw.getMarque());
    }
}