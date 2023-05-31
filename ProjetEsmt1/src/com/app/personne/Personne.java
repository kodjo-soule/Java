package com.app.personne;

//
//Application 1 – Création de la classe Personne
// Attributs d’instance : nom (String), prenom(String), sexe(char) et
//age(int)
// Attributs de classes : nbPersonnes
// Méthodes d’instance :
// void sePresenter ()
// Méthodes de classe :
// int getNbPersonnes ()
// Démo : Classe Application
public class Personne {
	public String nom;
	public String prenom;
	public char sexe;
	public int age;
	public static int nbPersonnes = 0;
	
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public char getSexe() {
		return sexe;
	}
	public int getAge() {
		return age;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public void setAge(int age) {
		if (age >0 ) {
			this.age = age;
		}
	}
	
	//conctructeur 
	public Personne(String nom, String prenom, char sexe, int age) {
		//
		this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        setAge(age);
        //
        this.nbPersonnes ++ ;;
	}
	
	//methode d'instance
	public void sePresenter() {
        System.out.println("Je suis " + nom + " " + prenom);
        System.out.println("Age : " + age);
        System.out.println("Sexe : " + (sexe == 'F'? "Feminin" : "Masculin")
        );
        
    }
	//Methode classes
	public static int getNbPersonnes() {
        return nbPersonnes;
    }
}
