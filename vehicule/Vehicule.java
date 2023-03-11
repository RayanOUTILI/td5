package vehicule;

public class Vehicule{
	private String marque; 
	private int dateAchat; 
	private double prixAchat;
	private double prixCourant;
	
	//constructeur
	public Vehicule(String marque, int dateAchat, double prixAchat) {
		this.marque = marque;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
		this.prixCourant = prixAchat; //au départ le prix courant = au prix achat
	}
	
	//getter prix courant
	public double getPrixCourant() {
		return prixCourant;
	}

	//setter prix courant
	public void setPrixCourant(double prixCourant) {
		this.prixCourant = prixCourant;
	}

	//getter prix achat
	public double getPrixAchat() {
		return prixAchat;
	}

	//setter prix achat
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	//getter date achat
	public int getDateAchat() {
		return dateAchat;
	}

	//setter date achat
	public void setDateAchat(int dateAchat) {
		this.dateAchat = dateAchat;
	}

	//getter marque
	public String getMarque() {
		return marque;
	}

	//La méthode calculePrix(int anneActuelle) 
	public void calculePrix(int anneActuelle) {
		for(int i = dateAchat; i < anneActuelle; i++) {
			prixCourant = prixAchat - (prixCourant * 0.01);
		}
	}
	
	//La méthode affiche() 
	public void affiche() {
		System.out.println("\n" + this);
	}

	//méthode toString
	public String toString() {
		return "Vehicule [marque=" + marque + ", dateAchat=" + dateAchat + ", prixAchat=" + prixAchat + ", prixCourant="+ prixCourant + "]";
	}

}