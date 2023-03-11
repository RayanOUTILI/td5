package ex1;

public class A
{
 // ici, exceptionnellement, pas d'encapsulation
    public int n;
    public int p=10;

    public A (int nn) {
    System.out.println("Entrée Constr. A : n="+n+" p="+p);
    n = nn;
    System.out.println("Sortie Constr. A : n="+n+" p="+p);
    }
}

