package Clases;

public class Arbol_binario {

    Nodo_Arbol root;

    public Arbol_binario() {
        root = null;
    }

    public void agregarNodo(int dato, String nombre) {
        Nodo_Arbol nuevo = new Nodo_Arbol(dato, nombre);
        if (root == null) {
            root = nuevo;
        } else {
            Nodo_Arbol aux = root;
            Nodo_Arbol padre;
            while (true) {
                padre = aux;
                if (dato < aux.dato) {
                    aux = aux.izq;
                    if (aux == null) {
                        padre.izq = nuevo;
                        return;
                    }
                }else{
                    aux = aux.der;
                    if(aux == null){
                        padre.der = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean EstaVacio(){
        return root == null;
    }
    
    public void inorden(Nodo_Arbol raiz){
        if(raiz != null){
            inorden(raiz.izq);
            System.out.println(raiz.dato);
            inorden(raiz.der);
        }
    }
}
