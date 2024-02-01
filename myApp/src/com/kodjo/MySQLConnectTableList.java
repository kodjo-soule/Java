package com.kodjo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MySQLConnectExample {
    public static void main(String[] args) {
 
        // creates three different Connection objects
        Connection conn1 = null;
//        Connection conn2 = null;
//        Connection conn3 = null;
// 
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/mydb";
            String user = "root";
            String password = "root";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
            	
            	
            	
            	//createTable();
            	String query = "select * from personne ";
            	Statement stm = conn1.createStatement();
                
            	//
            	//Statement stm1 = conn1.createStatement();
                String Countsql = "select count(*) as nb from personne";
                ResultSet CoutRes = stm.executeQuery(Countsql);
                CoutRes.next();
                int CoutResInt = 0 ;
                CoutResInt = CoutRes.getInt("nb");
                System.out.println("Nbre : "+ CoutResInt);
            	
            	ResultSet res = stm.executeQuery(query);
                String columns[] = { "ID", "Nom","Salaire", "Age"};
                //
                
                int i = 0;
                String data[][] = new String[CoutResInt][4];
                while (res.next()) {
//                    String nom = res.getString("Nom");
//                    int age = res.getInt("Age");
//                    float salaire = res.getFloat("Salaire");
//                    int id = res.getInt("ID");
//                    data[i][0] = nom;
//                    data[i][1] = age + "";
//                    data[i][2] = salaire + "";
//                    data[i][3] = id + "";
                	//
                	//Récupérer par nom de colonne
                    int id = res.getInt("id");
                    String nom = res.getString("nom");
                    int salaire = res.getInt("salaire");
                    int age = res.getInt("age");
                    //
                	System.out.println(" ID : " + id);
                    System.out.println(" Nom : " + nom);
                    System.out.println(" Salaire : " + salaire);
                    System.out.println(" Age : " + age);
                    System.out.println("------------------------------------");
                    //
                    data[i][0] = id + "";
                    data[i][1] = nom;
                    data[i][2] = salaire + "";
                    data[i][3] = age + "";
//                    
                    
                    i++;
                  }
                Object data1[][] = {
                		{1,2,3,4},
                		{"Apple", "iPhone", "M1",12},
                        {"Sony", "Xperia", "M2",34},
                        {"Microsoft", "Lumia", "M3",43},
                        {"Samsung", "Galaxy", "M4",34}
                		};
                //
                Object[][] data3 = {
                		  {"Cysboy", new JButton("6boy"), new JComboBox(new String[]{"toto", "titi", "tata"}), new Boolean(true)},
                		  {"BZHHydde", new JButton("BZH"), new JComboBox(new String[]{"toto", "titi", "tata"}), new Boolean(false)},
                		  {"IamBow", new JButton("BoW"), new JComboBox(new String[]{"toto", "titi", "tata"}), new Boolean(false)},
                		  {"FunMan", new JButton("Year"), new JComboBox(new String[]{"toto", "titi", "tata"}), new Boolean(true)}
                		};
                DefaultTableModel model = new DefaultTableModel(data3, columns);
                JTable table = new JTable(model);
                
                table.setShowGrid(true);
                table.setShowVerticalLines(true);
                table.setBackground(Color.gray);
                table.setFillsViewportHeight(true);
                
                //table.setPreferredSize(new Dimension(800, 150));
                //
              //Bloquer le redimensionnement
                //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                //
                
                //
                JScrollPane pane = new JScrollPane(table);
                JFrame f = new JFrame("Remplir JTable a partir d'une BDD");
                f.setLayout(new GridLayout(2,2));
                JPanel panel = new JPanel();
                panel.add(pane);
                f.add(panel);
                
                f.setSize(600, 400);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setVisible(true);
                //
                
                System.out.println("Connected to the database test1");
                
                
                
            }
 
//            // connect way #2
//            String url2 = "jdbc:mysql://localhost:3306/mydb?user=root&password=secret";
//            conn2 = DriverManager.getConnection(url2);
//            if (conn2 != null) {
//                System.out.println("Connected to the database test2");
//            }
// 
//            // connect way #3
//            String url3 = "jdbc:mysql://localhost:3306/mydb";
//            Properties info = new Properties();
//            info.put("user", "root");
//            info.put("password", "secret");
// 
//            conn3 = DriverManager.getConnection(url3, info);
//            if (conn3 != null) {
//                System.out.println("Connected to the database test3");
//            }
            conn1.close();
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            //ex.printStackTrace();
        }
    }
    public static void createTable() {
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
        //this.add(scroll,BorderLayout.CENTER);

    }
}