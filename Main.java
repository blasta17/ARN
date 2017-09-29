package TP1PRO2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuiller entrer votre ARN");
		String tempARN  =  sc.nextLine();
		
		//Conversion de string en ArrayList<Character>
		ArrayList<Character> arrayListARN = new ArrayList<Character>(); 
	    for(int i = 0; i<tempARN.length(); i++){
	    	arrayListARN.add(tempARN.charAt(i));
	    }
	    
	    ARN nouvelARN  = new ARN(arrayListARN);
	
		if (!nouvelARN.valide){
			System.err.println("La chaine entre est invalide ! ... \nTerminer");
			System.exit( 1 );
		}
	}

}
