package ex1;

public class TestInit {
    public static void main (String[] args)
    {
    A a = new A(5);
    A b = new B(5, 3);
    System.out.println(a);
    System.out.println(b);
    }
    /*Nous obtenons : 
    Entrée Constr. A : n=0 p=10
	Sortie Constr. A : n=5 p=10
	Entrée Constr. A : n=0 p=10
	Sortie Constr. A : n=5 p=10
	Entrée Constr. B : n=5 p=10 q=25
	Sortie Constr. B : n=5 p=3 q=10
     */
    
}
