package com.kodjo.Controller;
import com.kodjo.View.*;
import com.kodjo.Model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	private Model model;
	private MainUI mainUI;
	
	
	public Controller(Model model, MainUI mainUI) {
		super();
		this.model = model;
		this.mainUI = mainUI;
	}
	public void execute() {
		//Lancer authentication
		//
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
