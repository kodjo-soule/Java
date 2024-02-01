package com.app.runtime;

import com.app.personne.Etudiant;

class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciation de l'etudiant'
		Etudiant etudiant1 = new Etudiant("Kodjo", "Souleymane", 'M', 24, 123456, "M-ISI");
		etudiant1.sePresenter();
		System.out.println("----------------------------------------------------");
		
		//Nombre d'instance d'etudiant cree
		System.out.println("Nombre d'instance d'Etudiants crees : " + Etudiant.getNbPersonnes());
		
	}

}