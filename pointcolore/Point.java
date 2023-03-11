package pointcolore;

public class Point {
	private double x;
	private double y;

	//td1
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) { 
		this.y = y;
	}

	public Point projX() {
		return new Point(this.x, 0);
	}

	public Point projY() {
		return new Point(0, this.y);
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public Point getLocation() {
		return new Point(this.x, this.y);
	}

	public void setLocation(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void translate(int dx, int dy) {
		this.x = x + dx;
		this.y = y + dy;
	}
	//fin td1

	//Calcul de la distance entre le point courant et p
	public double getDistance(Point p) {
		return Math.hypot(this.x - p.x, this.y - p.y);
	}

	//Affichage d�un point : [x,y]
	public void afficher() {
		System.out.println("Voici le point x : " + this.x + " et le point y :" + this.y);
	}

	//Méthode equals qui retourne vrai si le point courant et celui passé en paramètre ont les mêmes coordonnées
	public boolean equals(Object obj) {
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	//Méthode clone qui retourne un point identique au point courant
	public Point clone() {
		return new Point(this.x, this.y);
	}
}