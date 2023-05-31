package com.app.runtime;

import com.app.personne.Personne;

public  class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p = new Personne("Kodjo", "Souleymane", 'H',00);
		p.sePresenter();
		System.out.println("Nbre : "+ Personne.getNbPersonnes() ) ;
		Personne p1 = new Personne("Kodjo", "Souleymane", 'H',00);
		p1.sePresenter();
		System.out.println("Nbre : "+ Personne.getNbPersonnes() ) ;

	}

}
