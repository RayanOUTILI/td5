package formes;

public class Rectangle {
	private int longueur;
	private int largeur;
	
	public Rectangle(int x, int y){ 
		longueur = x;
		largeur = y;
	}
	
	public int getLongueur() { return longueur; }
	public int getLargeur() { return largeur; }
	
	public double surface() {
		return longueur * largeur;
	}
	
	public void afficheSurface() {
		System.out.println(toString()+" de surface "+surface());
	}
	
	public String toString(){
		return "Rectangle "+longueur+"x"+largeur;
	}
}
