public class App{
    public static void main(String[] args){
        Ville bamako = new Ville("bamako", "Mali", 300000) ;
        bamako.affichage() ;
        bamako.setnomPays("Senegal") ;
        bamako.affichage() ;
    }
}