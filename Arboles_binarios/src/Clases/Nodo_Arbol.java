
package Clases;

public class Nodo_Arbol {
    int dato;
    Nodo_Arbol izq;
    Nodo_Arbol der;
    String nombre;
    
    public Nodo_Arbol(int d, String nombre){
        this.dato = d;
        this.nombre = nombre;
        this.izq = null;
        this.der = null;
    }
    
    public String toString(){
        return nombre+ " su dato es "+dato;
    }
    
    
}
