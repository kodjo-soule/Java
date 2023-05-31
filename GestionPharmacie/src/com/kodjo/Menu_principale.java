package com.kodjo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Menu_principale {

	private JFrame frmGestionDePharmacie;
	private JTextField textcode;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable _table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_principale window = new Menu_principale();
					window.frmGestionDePharmacie.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu_principale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionDePharmacie = new JFrame();
		frmGestionDePharmacie.setTitle("Gestion de pharmacie");
		frmGestionDePharmacie.getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		frmGestionDePharmacie.setResizable(false);
		frmGestionDePharmacie.setBounds(100, 100, 896, 652);
		frmGestionDePharmacie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionDePharmacie.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 882, 92);
		frmGestionDePharmacie.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel _titre = new JLabel("GESTION DE PHARMACIE");
		_titre.setForeground(Color.BLUE);
		_titre.setFont(new Font("Tahoma", Font.BOLD, 30));
		_titre.setHorizontalAlignment(SwingConstants.CENTER);
		_titre.setBounds(10, 11, 862, 70);
		panel.add(_titre);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 133, 882, 276);
		frmGestionDePharmacie.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel _code = new JLabel("Code : ");
		_code.setFont(new Font("Arial", Font.PLAIN, 18));
		_code.setBounds(33, 11, 73, 41);
		panel_1.add(_code);
		
		JLabel _quantite = new JLabel("Quantite");
		_quantite.setFont(new Font("Arial", Font.PLAIN, 18));
		_quantite.setBounds(33, 207, 73, 41);
		panel_1.add(_quantite);
		
		JLabel _prix = new JLabel("Prix :");
		_prix.setFont(new Font("Arial", Font.PLAIN, 18));
		_prix.setBounds(33, 141, 73, 41);
		panel_1.add(_prix);
		
		JLabel _nom = new JLabel("Nom : ");
		_nom.setFont(new Font("Arial", Font.PLAIN, 18));
		_nom.setBounds(33, 73, 73, 41);
		panel_1.add(_nom);
		
		JLabel _reste = new JLabel("Reste");
		_reste.setFont(new Font("Arial", Font.PLAIN, 18));
		_reste.setBounds(562, 141, 73, 41);
		panel_1.add(_reste);
		
		JLabel _payer = new JLabel("Payer");
		_payer.setFont(new Font("Arial", Font.PLAIN, 18));
		_payer.setBounds(562, 73, 73, 41);
		panel_1.add(_payer);
		
		textcode = new JTextField();
		textcode.setFont(new Font("Arial", Font.PLAIN, 12));
		textcode.setBounds(116, 17, 208, 32);
		panel_1.add(textcode);
		textcode.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 79, 208, 32);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 141, 208, 32);
		panel_1.add(textField_2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.RED);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(647, 17, 208, 32);
		panel_1.add(textField);
		
		JLabel _total = new JLabel("Total :");
		_total.setFont(new Font("Arial", Font.PLAIN, 18));
		_total.setBounds(562, 11, 73, 41);
		panel_1.add(_total);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.GREEN);
		textField_3.setBounds(645, 82, 208, 32);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.RED);
		textField_4.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.BLACK);
		textField_4.setBounds(645, 141, 208, 32);
		panel_1.add(textField_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner.setBounds(116, 214, 208, 29);
		panel_1.add(spinner);
		
		JButton btnNewButton = new JButton("Enregistrer");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(647, 206, 208, 42);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 552, 829, -125);
		frmGestionDePharmacie.getContentPane().add(scrollPane);
		
		_table = new JTable();
		_table.setBackground(Color.GRAY);
		_table.setBounds(24, 432, 836, 146);
		frmGestionDePharmacie.getContentPane().add(_table);
		_table.setBorder(new LineBorder(new Color(0, 0, 0)));
		_table.setFont(new Font("Arial", Font.PLAIN, 14));
	}
}
