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

	@Override
	public void calculePrix(int anneActuelle) {
		int tranche = 100;
		if (moteur == "hélices"){
			while(heuresVol - tranche > 0){
				setPrixCourant(getPrixCourant() - (getPrixCourant() * 0.10));
				heuresVol = heuresVol - tranche;
			}
		}
		else {
			tranche = 1000;
			while(heuresVol - tranche > 0){
				setPrixCourant(getPrixCourant() - (getPrixCourant() * 0.10));
				heuresVol = heuresVol - tranche;
			}
		}
		//on met le prix à 0 si le prix est négatif
		if (getPrixCourant() < 0){
			setPrixCourant(0);
		}
	}

	//toString	
	public String toString() {
		return super.toString() + "Avion [moteur=" + moteur + ", heuresVol=" + heuresVol + "]";
	}

		
}