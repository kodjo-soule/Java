/**
 * 
 */
package com.kodjo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator; 

public class App {
	public enum Langage {
		JAVA,
		C,
		Assembler,
		CPlus,
		PHP;	
	}
	static ArrayList al;
	//
	public App() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		App ap = new App();
		System.out.println("\n----------------------\n");
		for( Langage langage : Langage.values()) {
			System.out.println("Lang : "+ langage);
		}
		al = new ArrayList();
		al.add("Bouba");
		al.add("OZO");
		al.add(123);
		System.out.println("\n----------------------\n");
		for(int i = 0 ; i < al.size(); i++) {
			System.out.println("Data : "+ i + " : "+ al.get(i));
		}
		//Collections.sort(al);
		System.out.println("\n----------------------\n");
		System.out.println(al);
		
	}
}
