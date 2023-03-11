package pointcolore;

public class TestColoredPoint {
	public static void main(String[] args) {
		ColoredPoint cp1 = new ColoredPoint(1, 2, "red");
		ColoredPoint cp2 = new ColoredPoint(1, 2, "blue");
		ColoredPoint cp3 = new ColoredPoint(3, 4, "red");
		System.out.println(cp1.toString());
		System.out.println(cp2.toString());
		System.out.println(cp3.toString());

		//on test la méthode memeCouleur()
		System.out.println("cp1 a la meme couleur que cp2 : " + cp1.memeCouleur(cp2)); // false
		System.out.println("cp1 a la meme couleur que cp3 : " + cp1.memeCouleur(cp3)); // true

		//on test la méthode equals qui doit renvoyer true si les coordonnées ET les couleurs st identiques
		System.out.println("cp1 = cp2 " + cp1.equals(cp2)); // false
		ColoredPoint cp4 = cp1.clone();
		System.out.println("cp1 = cp4 " + cp1.equals(cp4)); // true

		//on test les projections avec et sans couleurs données en paramètre
		System.out.println(cp1.projX("yellow"));
		System.out.println(cp2.projX());

		//on créé un tableau de points simples et de points coloréss
		Point[] tab = new Point[10];
		tab[0] = new Point(0.0, 5.0);
		tab[1] = new Point(1.0, 4.0);
		tab[2] = new Point(2.0, 3.0);
		tab[3] = new Point(3.0, 2.0);
		tab[4] = new Point(4.0, 1.0);
		tab[5] = new ColoredPoint(1.0, 1.0, "red");
		tab[6] = new ColoredPoint(2.0, 2.0, "blue");
		tab[7] = new ColoredPoint(3.0, 3.0, "green");
		tab[8] = new ColoredPoint(4.0, 4.0, "black");
		tab[9] = new ColoredPoint(5.0, 5.0, "white");	
	

		//on test les méthodes toString, getDistance, projX, projY, equals
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].toString());
			System.out.println("distance de " + tab[i].toString() + " à l'origine : " + tab[i].getDistance(cp4));
			System.out.println("projection de " + tab[i].toString() + " sur l'axe des X : " + tab[i].projX());
			System.out.println("projection de " + tab[i].toString() + " sur l'axe des Y : " + tab[i].projY());
			System.out.println("cp1 = " + tab[i].toString() + " : " + cp1.equals(tab[i]));
		}

		//on test les méthodes instanceof et getClass().getName()
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].toString() + " est une instance de Point : " + (tab[i] instanceof Point));
			System.out.println(tab[i].toString() + " est une instance de ColoredPoint : " + (tab[i] instanceof ColoredPoint));
			System.out.println(tab[i].toString() + " est une instance de Object : " + (tab[i] instanceof Object));
			System.out.println(tab[i].toString() + " est une instance de ColoredPoint : " + (tab[i].getClass().getName().equals("pointcolore.ColoredPoint")));
			System.out.println(tab[i].toString() + " est une instance de Point : " + (tab[i].getClass().getName().equals("pointcolore.Point")));
			System.out.println(tab[i].toString() + " est une instance de Object : " + (tab[i].getClass().getName().equals("java.lang.Object")));
			System.out.println(tab[i].toString() + " est une instance de String : " + (tab[i].getClass().getName().equals("java.lang.String")));
		}

		//on créé un nouvel objet de type ColoredPoint
		ColoredPoint cp5 = (ColoredPoint) tab[6];
		System.out.println(cp5.toString());
		//quelle manipulation devez-vous faire et pourquoi ?
		//on doit faire un cast car tab[6] est un objet de type Point et non de type ColoredPoint - ou alors faire une boucle 
	}

}