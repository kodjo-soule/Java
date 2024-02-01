package com.app.personne;
//Créer une classe Etudiant (matricule (int), formation (String)) héritant
//de la classe Personne

public class Etudiant extends Personne {
	private int matricule;
	private String formation;
    public int getMatricule() {
		return matricule;
	}
	public String getFormation() {
		return formation;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public void setFormation(String formation) {
		this.formation = formation;
	}
	public Etudiant(String nom, String prenom, char sexe, int age, int matricule, String formation) {
    	super(nom, prenom, sexe, age);
        this.matricule = matricule;
        this.formation = formation;
    }
	@Override
	public void sePresenter() {
		// TODO Auto-generated method stub
        System.out.println("Etudiant " + this.getNom() + " " + this.getPrenom());
        //age
        System.out.println("Age : " + this.getAge());
        //sexe
        System.out.println("Sexe : " + this.getSexe());
        //matricule
        System.out.println("Matricule : " + this.getMatricule());
        //Formation
        System.out.println("Formation : " + this.getFormation());
        
        
	}
	
}
