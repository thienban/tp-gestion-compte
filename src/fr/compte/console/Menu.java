package fr.compte.console;

import java.util.Scanner;

public class Menu {
	
	public void afficher ()

	{
	// affichage menu
	System.out.println("***** Gestion Compte bancaire  *****\r\n" 
	+ "1. Lister les comptes\r\n"
	+ "2. Creer une  compte\r\n" 
	+ "3. Ajouter une operation a une compte\r\n" 
	+ "4. Afficher le solde d'une compte\r\n"
	+ "Afficher les opérations entre 2 dates données\r\n"
	+ "99. Sortir");

	// lire entrée
	Scanner sc = new Scanner(System.in);
	String choix = sc.nextLine();

	// les choix de l'utilisateur
		switch (choix) {
		case "1":
			
			break;
			
		case "2":
			
			
			break;
			
		case "3":
			
			break;
			
		case "4":
			
			
			break;
		case "99":
			System.out.println("Au revoir");
		}
	}
}

