package com.kodjo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AuthentificationUI extends JFrame implements ActionListener {
	//
	String url = "jdbc:mysql://localhost:3306/mydb";
    String user = "root";
    String password = "root";
	//
	//Les Composant
	private JLabel loginLabel = new JLabel("Login", JLabel.RIGHT);
	private JLabel passwordLabel = new JLabel("Password");
	private Font fontBold = new Font("Arial", Font.BOLD, 14);
	private JTextField loginField = new JTextField(15);
	private JPasswordField passwordField = new JPasswordField(15);
	

	private JButton submitButton = new JButton("Submit");
	private JButton cancelButton = new JButton("Cancel");
	
	//Les panel 
	private JPanel loginPanel = new JPanel();
	private JPanel passwordPanel = new JPanel();
	private JPanel submitPanel = new JPanel();
	
	//Constructor
	public AuthentificationUI() throws HeadlessException {
		super("Connexion");
		
		//Main Contener
		GridLayout mainPanel = new GridLayout(3,1);
		//ActionLister
		submitButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
	
		//Login Panel 
		
		loginPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		loginPanel.setBackground(Color.BLUE);
		
		loginLabel.setFont(fontBold);
		loginLabel.setForeground(Color.WHITE);
		loginPanel.add(loginLabel);
		loginPanel.add(loginField);
		this.add(loginPanel);
		
		//Password Panel
		
		passwordPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		passwordPanel.setBackground(Color.ORANGE);
		
		passwordPanel.setFont(fontBold);
		passwordPanel.setForeground(Color.WHITE);
		
		
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordField);
		this.add(passwordPanel);

		//Submit Panel
		
		submitPanel.setLayout(new FlowLayout());
		submitPanel.add(submitButton);
		submitPanel.add(cancelButton);
		this.add(submitPanel);
		
		
		
		//Frame configuration
		
		this.setTitle("Auhtentification");
//		this.setLayout(new GridLayout(3,1));
		
		this.setLayout(mainPanel);
		
		this.setSize(400, 300);
		
		this.setLocationRelativeTo(null);
	}
	public void execute() {
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == cancelButton) {
			int _res = JOptionPane.showConfirmDialog(this, "Etres-vous sur de vouloir quitter");
			if (_res == JOptionPane.YES_OPTION) {
				this.dispose();
			}else {
				clearForm();
			}
			
		}
		if( arg0.getSource() == submitButton) {
			String _login = (String) loginField.getText();
			String _pass = (String) passwordField.getText();
			if( _login.isEmpty() || _login.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please complete the password and the login");
			}else if ( _login.equals(_pass)) {
				DBAcces db = new DBAcces(url,user, password);
				
				
				if(db.connect()) {
					JOptionPane.showMessageDialog(this, "Connexion a la base de donné reussie ");
				}else {
					JOptionPane.showMessageDialog(this, "Erreur de connexion a la base de donné");
				}
				db.disconnect();
				new Fenetre();
//				quitter();
			}
		}
		
	}
	void quitter() {
		this.dispose();
	}
	void clearForm() {
		this.loginField.setText("");
		this.passwordField.setText("");
	}
	boolean readyBy(String _login , String _pass) {
		return true ;
	}
	
	
} 
