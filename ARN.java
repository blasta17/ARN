package TP1PRO2;

import java.util.ArrayList;


public class ARN {
	
	
	ArrayList<Character> valeurAccepter =  new ArrayList<Character>() ; 
	ArrayList<Character> chaineARN  ; 
	boolean valide  = false ;
	final Nucleaotide A = new Nucleaotide(5,5,5,0,135.13);
	final Nucleaotide C = new Nucleaotide(4,5,3,1,111.10);
    final Nucleaotide G = new Nucleaotide(5,5,5,1,151.13);
	final Nucleaotide U = new Nucleaotide(4,4,2,2,112.09);
	private int nbrCarbonneTotal = 0 ;
	private int nbrHydrogeneTotal = 0 ;
	private int nbrAzoteTotal = 0 ;
	private int nbrOxygeneTotal = 0 ;
	private double masseMolaireTotal = 0 ;

	
	public ARN(ArrayList<Character> arrayListARN) {
		chaineARN   =  new ArrayList<Character>(arrayListARN); 
		valeurAccepter =  new ArrayList<Character>() ; 
		valeurAccepter.add('A');
		valeurAccepter.add('C');
		valeurAccepter.add('G');
		valeurAccepter.add('U');
		// TODO Auto-generated constructor

		valide = estvalide(chaineARN, this.valide);

		if (valide){
			calculAtome(chaineARN);
		}

	}






	public boolean estvalide(ArrayList<Character> chaineARN, boolean valide) {
		if (this.chaineARN.size()%3==0) {
			valide=true ;
		}
		for(Character car :chaineARN ) {
			if (!this.valeurAccepter.contains(car) || Character.isLowerCase(car)) {
				valide=false ;
			}
		}
		if (chaineARN.size()<5){
			valide=false ;
		}

	  return valide;
	}

	public boolean rechercheEstvalide(ArrayList<Character> recheche, boolean valide) {
		if (recheche.size()!=0 && recheche.size()%3==0) {
			valide=true ;
		}

		RechercheMajuscule rMajuscule = new RechercheMajuscule() ;

		for(Character car :recheche ) {
			if (!rMajuscule.contains(car)) {
				valide = false ;
			}
		}

		return valide;
	}

	public void calculAtome(ArrayList<Character> chaineARN){

		for(Character car :chaineARN ) {
			switch (car){
				case 'A' : {
					this.nbrAzoteTotal += this.A.getNbrAzote();
					this.nbrCarbonneTotal += this.A.getNbrCarbonne() ;
					this.nbrHydrogeneTotal += this.A.getNbrHydrogene() ;
					this.nbrOxygeneTotal += this.A.getNbrOxygene() ;
					this.masseMolaireTotal += this.A.getMasseMolaire();
				}
				case 'C' :
					this.nbrAzoteTotal += this.C.getNbrAzote();
					this.nbrCarbonneTotal += this.C.getNbrCarbonne() ;
					this.nbrHydrogeneTotal += this.C.getNbrHydrogene() ;
					this.nbrOxygeneTotal += this.C.getNbrOxygene() ;
					this.masseMolaireTotal += this.C.getMasseMolaire();

				case 'G' :
					this.nbrAzoteTotal += this.G.getNbrAzote();
					this.nbrCarbonneTotal += this.G.getNbrCarbonne() ;
					this.nbrHydrogeneTotal += this.G.getNbrHydrogene() ;
					this.nbrOxygeneTotal += this.G.getNbrOxygene() ;
					this.masseMolaireTotal += this.G.getMasseMolaire();

				case 'U' :
					this.nbrAzoteTotal += this.U.getNbrAzote();
					this.nbrCarbonneTotal += this.U.getNbrCarbonne() ;
					this.nbrHydrogeneTotal += this.U.getNbrHydrogene() ;
					this.nbrOxygeneTotal += this.U.getNbrOxygene() ;
					this.masseMolaireTotal += this.U.getMasseMolaire();

			}

		}


	}


	public int getNbrCarbonneTotal() {
		return nbrCarbonneTotal;
	}

	public void setNbrCarbonneTotal(int nbrCarbonneTotal) {
		this.nbrCarbonneTotal = nbrCarbonneTotal;
	}

	public int getNbrHydrogeneTotal() {
		return nbrHydrogeneTotal;
	}

	public void setNbrHydrogeneTotal(int nbrHydrogeneTotal) {
		this.nbrHydrogeneTotal = nbrHydrogeneTotal;
	}

	public int getNbrAzoteTotal() {
		return nbrAzoteTotal;
	}

	public void setNbrAzoteTotal(int nbrAzoteTotal) {
		this.nbrAzoteTotal = nbrAzoteTotal;
	}

	public int getNbrOxygeneTotal() {
		return nbrOxygeneTotal;
	}

	public void setNbrOxygeneTotal(int nbrOxygeneTotal) {
		this.nbrOxygeneTotal = nbrOxygeneTotal;
	}

	public double getMasseMolaireTotal() {
		return masseMolaireTotal;
	}

	public void setMasseMolaireTotal(double masseMolaireTotal) {
		this.masseMolaireTotal = masseMolaireTotal;
	}
}
