package com.kodjo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Fenetre extends JFrame{
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Bouton");
	public Fenetre() {
		// TODO Auto-generated constructor stub
		createTable();
		//
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("HK Window");
		this.setResizable(false);
		this.setAlwaysOnTop(true);

		this.setLayout( new GridLayout(3,2) );
	    for( int i = 0 ; i < 6 ; i++) {
	    	int j = i + 1 ;
	    	this.getContentPane().add(new JButton(""+j));
	    }		
		this.add(new JLabel("OKAY"));
		this.setVisible(true);
	}
	public  void createTable() {
    	//ligne 1
        Vector<String> row1 = new Vector<String>();
        row1.addElement("A");
        row1.addElement("B");
        row1.addElement("C");
        
        //ligne 2
        Vector<String> row2 = new Vector<String>();
        row2.addElement("X");
        row2.addElement("Y");
        row2.addElement("Z");
        
        //données pour JTable(ligne 1 + ligne 2)
        Vector<Vector> data = new Vector<Vector>();
        data.addElement(row1);
        data.addElement(row2);
        
        //Header de JTable
        Vector<String> columns = new Vector<String>();
        columns.addElement("Colonne 1");
        columns.addElement("Colonne 2");
        columns.addElement("Colonne 3");
        JTable table = new JTable(data, columns);
        JScrollPane scroll = new JScrollPane(table);
        this.add(scroll,BorderLayout.CENTER);
    }
}
