package vehicule; 

public class Voiture extends Vehicule{
	private double cylindree;
	private int nbPortes;
	private double puissance;
	private double kilometrage;
	
	//constructeur en faisant appel au constructeur de la classe Vehicule
	public Voiture(String marque, int dateAchat, double prixAchat, double cylindree, int nbPortes, double puissance, double kilometrage) {
		super(marque, dateAchat, prixAchat);
		this.cylindree = cylindree;
		this.nbPortes = nbPortes;
		this.puissance = puissance;
		this.kilometrage = kilometrage;
	}

	//getter kilometrage
	public double getKilometrage() {
		return kilometrage;
	}

	//setter kilometrage
	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}

	//La méthode calculePrix(int anneActuelle) en utilisant des getters et setters
	@Override
	public void calculePrix(int anneActuelle) {
		//on garde les km de la voiture
		double km = getKilometrage();
		//moins 2% par an depuis l'année d'achat
		//j'ai préféré retirer les 2% par rapport à l'année précédente (cela paraît plus logique)
		for(int i = getDateAchat(); i < anneActuelle; i++) {
			setPrixCourant(getPrixCourant() - (getPrixCourant() * 0.02));
		}
		//moins 5% tous les 10000km parcourus
		while(kilometrage - 10000 > 0){
			setPrixCourant(getPrixCourant() - (getPrixCourant() * 0.05));
			setKilometrage(getKilometrage() - 10000);
		}
		//si la marque est "Renault" ou "Peugeot" on fait une réduction de 10%
		if(getMarque().equals("Renault") || getMarque().equals("Fiat")) {
			setPrixCourant(getPrixCourant() - (getPrixCourant() * 0.1));
		}
		//si la marque est Ferrari ou Porsche on augmente le prix de 20%
		if(getMarque().equals("Ferrari") || getMarque().equals("Porsche")) {
			setPrixCourant(getPrixCourant() + (getPrixCourant() * 0.2));
		}
		//on met le prix à 0 si le prix est négatif
		if (getPrixCourant() < 0){
			setPrixCourant(0);
		}
		//le prix actuel ne doit pas être plus grand que le prix d'achat
		if (getPrixCourant() > getPrixAchat()){
			setPrixCourant(getPrixAchat());
		}
		//on remet le km de la voiture
		setKilometrage(km);
	}

	//toString en utilisant la méthode toString de la classe Vehicule
	@Override
	public String toString() {
		return super.toString() + "Voiture [cylindree=" + cylindree + ", nbPortes=" + nbPortes + ", puissance=" + puissance + ", kilometrage=" + kilometrage + "]";
	}
	
}