package pointcolore; 

public class ColoredPoint extends Point{
	
	private String couleur;

	//constructeur qui fait appel au constructeur de la classe Point
    public ColoredPoint(double x, double y, String color) {
        super(x, y);
        this.couleur = color;
    }

	//accesseur de consultation de la couleur
	public String getCouleur() {
		return couleur;
	};

	//méthode memeCouleur qui retourne vrai si le point coloré courant et celui passé en paramètre sont de la même couleur 
	public boolean memeCouleur(Point a){
		return this.getCouleur().equals(((ColoredPoint) a).getCouleur());
	}

	//méthode equals qui retourne vrai si le point coloré courant et celui passé en paramètre sont de la même couleur et ont les mêmes coordonnées
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && memeCouleur((ColoredPoint) obj);
	}

	//méthode clone qui retourne un point coloré identique au point coloré courant
	@Override
	public ColoredPoint clone() {
		return new ColoredPoint((int) this.getX(), (int) this.getY(), this.couleur);
	}

	//méthode toString qui retourne les coordonnées et la couleur du point coloré courant
	@Override
	public String toString() {
		return super.toString() + " " + couleur;
	}

	//méthode projX qui retourne un point coloré projeté sur l’axe des abscisses et dont la couleur est celle passée en paramètre
	public ColoredPoint projX(String color) {
		return new ColoredPoint((int) getX(), 0, color);
	}

	//méthode projY qui retourne un point coloré projeté sur l’axe des ordonnées et dont la couleur est celle passée en paramètre
	public ColoredPoint projY(String color) {
		return new ColoredPoint(0, (int) getY(), color);
	}
	
}