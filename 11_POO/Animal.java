public class Animal {
    public String nom;
    public int legs ;
    public String typeAnimal ;

    public Animal() {
        this.nom = "Inconnue";
    }

    public Animal(String nom) {
        this.nom = nom;

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void eat() {
        System.out.println(this.nom.toUpperCase() + " animal eats");
    }

    // Fonction makeSound
    public void makeSound() {
        System.out.println("Gr ....");
    }
}
