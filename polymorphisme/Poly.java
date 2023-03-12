package polymorphisme;

class A{
    public void affiche(){
        System.out.println("Je suis un A");
    }
}

package polymorphisme;

class B extends A{
    
}

package polymorphisme;

class C extends A{
    public void affiche(){
        System.out.println("Je suis un C");
    }
}

package polymorphisme;

class D extends C {
    public void affiche(){
        System.out.println("Je suis un D");
    }    
}

package polymorphisme;

class E extends B {
    
}

package polymorphisme;

class F extends C{
    
}
package polymorphisme;
public class Poly {
    public static void main(String[] args){
        A a = new A() ; a.affiche() ; System.out.println();
        
        B b = new B() ; a=b;
        b.affiche() ; a.affiche() ; System.out.println();
        
        C c=new C() ; a=c;
        c.affiche() ; a.affiche() ; System.out.println();
        
        D d=new D() ; a=d; c=d;
        d.affiche(); a.affiche(); c.affiche(); System.out.println();
        
        E e=new E() ; a=e; b=e;
        e.affiche(); a.affiche(); b.affiche() ; System.out.println();
        
        F f = new F(); a = f; c=f;
        f.affiche() ; c.affiche() ; c.affiche() ; System.out.println();
    }
    /*Je suis un A
     * Je suis un A
     * Je suis un C
     * Je suis un D
     * Je suis un D
     * Je suis un A
     * Je suis un C
     */
}

