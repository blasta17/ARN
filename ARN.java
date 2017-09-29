package TP1PRO2;

import java.util.ArrayList;


public class ARN {
	
	
	ArrayList<Character> valeurAccepter =  new ArrayList<Character>() ; 
	ArrayList<Character> chaineARN  ; 
	boolean valide  = false ; 


	

	
	public ARN(ArrayList<Character> arrayListARN) {
		
		chaineARN   =  new ArrayList<Character>(arrayListARN); 
		valeurAccepter =  new ArrayList<Character>() ; 
		valeurAccepter.add('A');
		valeurAccepter.add('C');
		valeurAccepter.add('G');
		valeurAccepter.add('U');
		// TODO Auto-generated constructor

		valide = estvalide(chaineARN);
	}






	public boolean estvalide(ArrayList<Character> chaineARN) {
		if (this.valeurAccepter.size()%3==0) {
			this.valide=true ; 
		}
		for(Character car :chaineARN ) {
			if (!this.valeurAccepter.contains(car)) {
				this.valide=false ; 
			}
			
		}
		if (chaineARN.size()<5){
			this.valide=false ;
		}

	  return valide;
	}




}
