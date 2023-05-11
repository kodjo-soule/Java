package com.kodjo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	//Font 
	
	Font font2 = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14);
	//Composant
	private JLabel label1 =  new JLabel("Loi de concentration");
	private JButton btnMessage = new JButton("Mon bouton");
	//Layout 
		
	//Conteneur
	static JPanel panel1 = new JPanel(); 
	Fenetre(){
		this.setTitle("Fenetre");
		this.setVisible(true);
		this.setSize(800, 500);
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void initFenetre() {
		label1.setFont(font2);
		label1.setForeground(Color.RED);
		panel1.add(label1);
		panel1.setSize(100,20);
		panel1.add(btnMessage);
		panel1.setBackground(Color.GREEN);

		this.add(panel1);
	}
	public void borderLayoutUI() {
		this.setLayout(new BorderLayout());
		this.getContentPane().add(panel1, BorderLayout.CENTER);
		this.getContentPane().add(new JLabel("OKAY"), BorderLayout.NORTH);
		this.getContentPane().add(new JLabel("Actualite"), BorderLayout.EAST);
	}
	public void flowLayoutUI() {
		this.setLayout(new FlowLayout());
		this.getContentPane().add(new JLabel("OKAY"));
		this.getContentPane().add(new JLabel("Actualite"));
	}
	
}
