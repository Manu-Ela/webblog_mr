package webblogNeu;

import java.util.Scanner;

public class Webblog {

	public static void main(String[] args) {
		// TODO MR Webblock fertigmachen
		
		// Hauptmen�
		
		Scanner hauptMenue = new Scanner(System.in);
		
		System.out.println("Willkommen beim Blog");
		System.out.println();
		System.out.println("Bitte w�hlen...");
		System.out.println();
		System.out.println("1 - Beitrag schreiben");
		System.out.println("2 - Betr�ge anzeigen");
		System.out.println("9 - Ende");
		
		int eingabeHauptMenue = 0;
		
		do {
			System.out.println("Deine Wahl: ");
			eingabeHauptMenue = hauptMenue.nextInt();
			
			switch(eingabeHauptMenue) {
			case 1: 
				System.out.println("Beitrag schreiben:");
				System.out.println();
				break;
			case 2:
				System.out.println("Vorhandene Beitr�ge");
				System.out.println();
				break;
			case 9:
				System.out.println("Vielen Dank!");
				System.out.println();
				break;
			}
			
		}
		while (eingabeHauptMenue!=1&&eingabeHauptMenue!=2&&eingabeHauptMenue!=9);
		
		
		
		
		
		/*
		Blog blog = new Blog();
		System.out.println(blog);
		
		Beitrag beitrag = new Beitrag();
		
		blog.addBeitrag(beitrag);
		System.out.println(blog);
		
		Beitrag[] beitraege = blog.getBeitraege();
		System.out.println(beitraege);
		*/

	}

}
