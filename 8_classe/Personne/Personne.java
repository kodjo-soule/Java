
public class Personne{
    private int age ;
    private String nom ;

    public Personne(){
        this.nom = "Iconnue" ;
        this.age = 0 ;
    }
    public Personne(String nom,int age){
        this.nom = nom ;
        this.age = age;
    }
    public void setName(String nom){
        this.nom = nom ;
    }
    public String getName(){
        return this.nom ;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public int getAge(){
        return this.age ;
    }
}