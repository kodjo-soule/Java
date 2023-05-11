package com.kodjo;
import javax.swing.JOptionPane;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fenetre
		//Fenetre fn = new Fenetre();
//		Calculatrice calculatrice = new Calculatrice();
		
		// ConnexionUI cn = new ConnexionUI();
		// cn.showME();
		//
}
public static void auth(){
    String username = ""; // Le nom d'utilisateur saisi
        String password = ""; // Le mot de passe saisi
        boolean isAuthenticated = false; // Indique si l'utilisateur est authentifié
        
        // Afficher la boîte de dialogue d'authentification jusqu'à ce que l'utilisateur entre un nom d'utilisateur et un mot de passe valides
        while (!isAuthenticated) {
            // Demander le nom d'utilisateur et le mot de passe de l'utilisateur
            username = JOptionPane.showInputDialog(null, "Nom d'utilisateur :", "Authentification", JOptionPane.PLAIN_MESSAGE);
            password = JOptionPane.showInputDialog(null, "Mot de passe :", "Authentification", JOptionPane.PLAIN_MESSAGE);
            
            // Vérifier si le nom d'utilisateur et le mot de passe sont valides (dans cet exemple, nous avons défini le nom d'utilisateur et le mot de passe à "admin")
            if (username.equals("admin") && password.equals("admin")) {
                isAuthenticated = true;
            } else {
                JOptionPane.showMessageDialog(null, "Nom d'utilisateur ou mot de passe invalide.", "Erreur d'authentification", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
