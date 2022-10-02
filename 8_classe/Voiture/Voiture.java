public class Voiture{
    protected String marque ;
    protected int vitesse ;
    public Voiture(){
        this.marque = "inconnue" ;
        this.vitesse = 0 ;
    }
    public Voiture(String marque, int vitesse){
        this.marque = marque ;
        this.vitesse = vitesse ;
    }
    //Mutateur
    public void setMarque(String marque){
        this.marque = marque ;
    }
    public void setVitesse(int vitesse){
        this.vitesse = vitesse ;
    }
    //Accesseur 
    public String getMarque(){
        return this.marque ;
    }
    public int getVitesse(){
        return this.vitesse ;
    }
}