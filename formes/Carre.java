package formes;

//classe Carre qui hérite de la classe Rectangle
public class Carre extends Rectangle{
    
	public static void main(String[] args) {
		Carre c = new Carre(5);
		c.afficheSurface();
		System.out.println("La longueur de ce carré : " + c.getLongueur());
		System.out.println("La largeur de ce carré : " + c.getLargeur());
		System.out.println(c.toString());

		Rectangle r = new Rectangle(4, 3);	
		r.afficheSurface();
		System.out.println("La longueur de ce rectangle : " + r.getLongueur());
		System.out.println("La largeur de ce rectangle : " + r.getLargeur());
		System.out.println(r.toString());
	}
//constructeur de la classe Carre
	public Carre(int x){
		// un carré est un rectangle où x = y
		super(x,x);
	} 
	
	//on redéfinie la méthode afficheSurface() de la classe Rectangle
	@Override
	//ici le toString est différent de celui de la classe Rectangle
	public void afficheSurface() {
		System.out.println(toString()+" de surface "+surface());
	}
	
	//on redéfinie la méthode toString() de la classe Rectangle
	@Override	
	public String toString(){
		return "Carré "+getLongueur()+"x"+getLargeur();
	}
}
