package com.app.personne;

public abstract class Personne {
	private String nom;
	private String prenom;
	private char sexe;
	private int age;
	//variable d'instance
	private static int nbPersonnes = 0;
	
	
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
	        System.out.println(nom + " " + prenom);
	        System.out.println("Age : " + age);
	        System.out.println("Sexe : " + (sexe == 'F'? "Feminin" : "Masculin")
	        );
	        
	    }
	//Methode classes
	public static int getNbPersonnes() {
        return nbPersonnes;
    }
}
