package TP1PRO2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){

		DecimalFormat format =  new DecimalFormat("#.00");
		Scanner sc = new Scanner(System.in);
		String recherche = null ;
		String tempARN = null ;
		boolean rtrue = false;




		System.out.println("Veuiller entrer votre ARN");
		tempARN  =  sc.nextLine();
		
		//Conversion de tempARN en ArrayList<Character>
		ArrayList<Character> arrayListARN = new ArrayList<Character>();
	    for(int i = 0; i<tempARN.length(); i++){
	    	arrayListARN.add(tempARN.charAt(i));
	    }

	    // Creation du nouvelle ARN a partir du nouvel ArrayList "arrayListARN"
	    ARN nouvelARN  = new ARN(arrayListARN);

		// Vérification de la validiter de l'ARN
		if (!nouvelARN.valide){
			System.err.println("La chaine entre est invalide ! ... \nTerminer");
			System.exit( 1 );
		}else{
			// Affichage des Information sur l'ARN
			System.out.println("\nARN VALIDE 1");
			System.out.println("\nNombre d'atome de carbone  : " + nouvelARN.getNbrCarbonneTotal() + " atomes" );
			System.out.println("Nombre d'atome de hydrogene : " + nouvelARN.getNbrHydrogeneTotal() + " atomes" );
			System.out.println("Nombre d'atome de azote : " + nouvelARN.getNbrAzoteTotal() + " atomes" );
			System.out.println("Nombre d'atome de oxygene : " + nouvelARN.getNbrOxygeneTotal() + " atomes" );
			System.out.println("La masse molaire total est de : " + format.format(nouvelARN.getMasseMolaireTotal() )+ " g/mol" );
		}


		// Début de la recherche
		System.out.println("Veuillez faire une requete de recherche : ");
		recherche = sc.nextLine();
		ArrayList<Character> rechercheARN = new ArrayList<Character>();
		for(int i = 0; i<recherche.length(); i++){
			rechercheARN.add(recherche.charAt(i));
		}

		rtrue = nouvelARN.rechercheEstvalide(rechercheARN, rtrue);




	}

}
