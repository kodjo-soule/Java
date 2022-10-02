public class Ville{
    String nomVille ;
    String nomPays ;
    int nbreHabitants ;

    public Ville(){
        this.nomVille = "Inconnue ";
        this.nomPays = "Inconnue" ;
        this.nbreHabitants = 0 ;
    }
    public Ville(String nomVille, String nomPays, int nbreHabitants){
        this.nomVille = nomVille ;
        this.nomPays = nomPays ;
        this.nbreHabitants = nbreHabitants ;
    }
    public void affichage(){
        System.out.println(this.nomPays);
    }
    public void setnomVille(String nom){
        this.nomVille = nom ;
    }
    public void setnomPays(String pays){
        this.nomPays = pays ;
    }
    public String getnomVille(){
        return this.nomVille ;
    }
}