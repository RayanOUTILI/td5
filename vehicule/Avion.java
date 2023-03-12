package vehicule;

public class Avion extends Vehicule{
	private String moteur; 
	private int heuresVol; 
	
	//constructeur
	public Avion(String marque, int dateAchat, double prixAchat, String moteur, int heuresVol) {
		super(marque, dateAchat, prixAchat);
		this.moteur = moteur;
		this.heuresVol = heuresVol;
	}

	//getter heures vol
	public int getHeuresVol() {
		return heuresVol;
	}

	//setter heures vol
	public void setHeuresVol(int heuresVol) {
		this.heuresVol = heuresVol;
	}

	//getter moteur
	public String getMoteur() {
		return moteur;
	}

	//setter moteur
	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}

	@Override
	public void calculePrix(int anneActuelle) {
		//on garde le nb d'heures de vol
		int heure = getHeuresVol();
		int tranche = 100;
		if (getMoteur() == "hélices"){
			while(getHeuresVol() - tranche > 0){
				setPrixCourant(getPrixCourant() - (getPrixCourant() * 0.10));
				setHeuresVol(getHeuresVol() - tranche);
			}
		}
		else {
			//on retire 10% du prix courant tous les 1000 heures de vol
			tranche = 1000;
			while(getHeuresVol() - tranche > 0){
				setPrixCourant(getPrixCourant() - (getPrixCourant() * 0.10));
				setHeuresVol(getHeuresVol() - tranche);
			}
		}
		//on met le prix à 0 si le prix est négatif
		if (getPrixCourant() < 0){
			setPrixCourant(0);
		}
		//on remet le nb d'heures de vol
		setHeuresVol(heure);
	}

	//toString	
	public String toString() {
		return super.toString() + "Avion [moteur=" + moteur + ", heuresVol=" + heuresVol + "]";
	}

		
}