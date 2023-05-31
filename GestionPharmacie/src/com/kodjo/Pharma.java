package com.kodjo;

public class Pharma {
	int code ;
	String nom ;
	int prix ;
	int qte ;
	int total ;
	int payer ;
	int reste ;
	
	public Pharma(int code, String nom, int prix, int qte, int payer) {
		
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.qte = qte;
		this.payer = payer;
	}
	public Pharma(int code, String nom, int prix, int qte, int total, int payer, int reste) {
		
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.qte = qte;
		this.total = total;
		this.payer = payer;
		this.reste = reste;
	}
	public int getCode() {
		return code;
	}
	public String getNom() {
		return nom;
	}
	public int getPrix() {
		return prix;
	}
	public int getQte() {
		return qte;
	}
	public int getTotal() {
		return total;
	}
	public int getPayer() {
		return payer;
	}
	public int getReste() {
		return reste;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setPayer(int payer) {
		this.payer = payer;
	}
	public void setReste(int reste) {
		this.reste = reste;
	}
}
