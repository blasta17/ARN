package TP1PRO2;

import java.util.ArrayList;

public class Nucleaotide {

	
	private int nbrCarbonne = 0 ;
	private int nbrHydrogene = 0 ;
	private int nbrAzote = 0 ;
	private int nbrOxygene = 0 ;
	private double masseMolaire = 0 ;
	
	
    public Nucleaotide(int nbrCarbonne , int nbrHydrogene, int nbrAzote, int nbrOxygene,double masseMolaire){
		this.nbrCarbonne = nbrCarbonne ;
    	this.nbrHydrogene = nbrHydrogene ;
    	this.nbrAzote = nbrAzote ;
    	this.nbrOxygene = nbrOxygene ;
    	this.masseMolaire = masseMolaire ;
	}


	public int getNbrCarbonne() {
		return nbrCarbonne;
	}

	public void setNbrCarbonne(int nbrCarbonne) {
		this.nbrCarbonne = nbrCarbonne;
	}

	public int getNbrHydrogene() {
		return nbrHydrogene;
	}

	public void setNbrHydrogene(int nbrHydrogene) {
		this.nbrHydrogene = nbrHydrogene;
	}

	public int getNbrAzote() {
		return nbrAzote;
	}

	public void setNbrAzote(int nbrAzote) {
		this.nbrAzote = nbrAzote;
	}

	public int getNbrOxygene() {
		return nbrOxygene;
	}

	public void setNbrOxygene(int nbrOxygene) {
		this.nbrOxygene = nbrOxygene;
	}

	public double getMasseMolaire() {
		return masseMolaire;
	}

	public void setMasseMolaire(double masseMolaire) {
		this.masseMolaire = masseMolaire;
	}
}
