package com.kodjo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class ConnexionUI extends JFrame implements ActionListener{
	private Connection conn1 = null;
	private JPanel loginPanel = new JPanel();
	private JPanel passworkPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JPanel funPanel = new JPanel();
	//
	//fun
	private JButton funButton = new JButton("Message") ;
	//fun
	private JButton validerButton = new JButton("Valider") ;
	private JButton quitterButton = new JButton("Quitter") ;
	private TextField loginTextField= new TextField(15);
	private JPasswordField passworkTextField = new JPasswordField(15);
	public ConnexionUI() throws HeadlessException  {
		super("Connexion");
		
		this.setSize (300, 300);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(4,1));
		//
		
		//
		loginPanel.setLayout (new FlowLayout (FlowLayout.LEFT));
		passworkPanel.setLayout (new FlowLayout (FlowLayout.LEFT));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
		//bouton
		
		
		// Ajout du login et du champ de saisie dans le panel 1
		
		loginPanel.add(new JLabel("Login   :     "));
		loginPanel.add(loginTextField);
		
		// Ajout du password et du champ mot de passe dans le panel 2
		// Création du label Password et du champ mot de passe ...
		passworkPanel.add(new JLabel("Password : "));
		passworkPanel.add(passworkTextField);
		passworkPanel.setBackground(Color.gray);
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
		/// Ajout des boutons dans le panel 3 ...
		//
		quitterButton.addActionListener(this);
		validerButton.addActionListener(this);
		bottomPanel.add(validerButton) ;
		bottomPanel.add(quitterButton) ;
		//
		funButton.addActionListener(this);
		funPanel.add(funButton);
		//Ajout des panel dans le JFrame (GridLayout)
		this.add(loginPanel);
		this.add(passworkPanel);
		
		this.add(bottomPanel);
		
		this.add(funPanel);
		
		//Evenement
	    
		
		//
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	 
	public void actionPerformed(ActionEvent arg0) {
		
		System.out.println("Bouton " + arg0.getSource() + " cliqué !");
	
		if(arg0.getSource() == validerButton) {
			//loginTextField.setText("Welcome to WayToLearnX");
			String loginText = loginTextField.getText();
			String passworkText = passworkTextField.getText();
			System.out.println("------------------------------");
			System.out.println(loginText + ":" + passworkText);
			//
			if(ISauthen(loginText, passworkText)) {
				afficherMessage("Success");
			}
			//
			if (loginText.equals("") || passworkText.equals("")) {
				afficherMessage("Champs vides");
			}
			else if(loginText.equals("admin") && passworkText.equals("admin")) {
				afficherMessage("Success");
			}else {
				afficherMessage("Erreur");
			}
		}
		if(arg0.getSource() == quitterButton) {
			loginTextField.setText("Welcome to Sololearn");
			//System.exit(0);
			quitter();
			//this.dispose();
		}
		if(arg0.getSource() == funButton) {
			//
			
			//String heure = DateFormat.getTimeInstance().format(date) ;
			
			afficheHeure();
			String m_text = afficherMessageInput("Notre Nom : ");
			if (!m_text.isEmpty())
			afficherMessageAlerte(m_text);
		}
			  
	}
	private void afficherMessage(String msg) {
		JDialog d =  new JDialog(this, "Information");
		JLabel l = new JLabel(msg);
		d.add(l);
		d.setLocationRelativeTo(this);
		d.setSize(200, 100);
		d.setResizable(false);
		d.setVisible(true);
	}
	//
	private void afficherMessageAlerte(String msg) {
		JOptionPane.showMessageDialog(this, msg,"Alerte", JOptionPane.WARNING_MESSAGE);
	}
	private String afficherMessageInput(String msg) {
		String m_text = JOptionPane.showInputDialog(this, msg);
		return m_text ;
	}
	public void showME() {
		this.setVisible(true);
	}
	//
	public static void afficheHeure() {
		SimpleDateFormat SDFormat = new SimpleDateFormat("MM/dd/yyyy");
		//
		DateFormat DFormat = DateFormat.getTimeInstance();

		System.out.println("Object: " + DFormat);
		Date date = new Date();
        String str_Date1 = SDFormat.format(date);
		// Displaying original date
        System.out.println("The Original: " + (str_Date1));
 
        
		String str = DFormat.format(new Date());
		
		System.out.println(str);
		// Formatting the string using format() method
		//String str = DateFormat.getTimeInstance().format(new Date());

		// Displaying the formatted string time on console
		
	}
	public  void quitter() {
		
		int res = JOptionPane.showConfirmDialog(this,"Etes-vous sur?");
	    
	    if(res == JOptionPane.YES_OPTION)
	    {
	      //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     this.dispose();
	    }
	}
	public boolean ISauthen(String m_login, String m_passwork) {
		// connect way #1
        String url1 = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";
        try {
			conn1 = DriverManager.getConnection(url1, user, password);
			boolean verifie =false ;
			if (conn1 != null) {
	        	String rep = "select login, passwork from t_users";
	        	Statement stm = conn1.createStatement();
	        	ResultSet res = stm.executeQuery(rep);
	            while(res.next()) {
	            	 String login = res.getString("login");
	            	 String passwork = res.getString("passwork");
	            	 System.out.println("----------------");
	            	 System.out.println(login + ":" + passwork);
	            	 System.out.println(m_login + ":" + m_passwork);
	            	 //if (login.equals(m_login ) && password.equals(m_passwork) ) {
	            	 if (login==m_login  && m_passwork==password) {	 
	            		   System.out.println("OK");
	            		   //return true ;
	            	 }else {
	            		 System.out.println("pas OK");
	            	 }
	            }
	        }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
        return false ;
	}
}
