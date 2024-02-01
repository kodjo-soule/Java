package com.app.personne;

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
		if(matricule > 0) {
			this.matricule = matricule;
		}
	}
	public void setFormation(String formation) {
		this.formation = formation;
	}
	public Etudiant(String nom, String prenom, char sexe, int age, int matricule, String formation) {
    	super(nom, prenom, sexe, age);
        this.setMatricule(matricule); 
        this.formation = formation;
    }
	@Override
	public void sePresenter() {
		// TODO Auto-generated method stub
		System.out.println("***Etudiant***");
		super.sePresenter();
        //matricule
        System.out.println("Matricule : " + this.getMatricule());
        //Formation
        System.out.println("Formation : " + this.getFormation());
        
        
	}
	
}
