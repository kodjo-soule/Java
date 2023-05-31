package com.app.runtime;

import com.app.personne.Personne;
import com.app.personne.Etudiant;

public abstract class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Etudiant etudiant = new Etudiant("Kodjo", "Souleymane", 'M', 30, 123456, "Management");
		etudiant.sePresenter();

	}

}
