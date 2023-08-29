public class Nodos {
    int Valor;
    Nodos Nodo_Siguiente;
    Nodos Nodo_Anterior;
    
    //constuctor cuando hay nodos
    public Nodos(int Elemento, Nodos Siguiente_Nodo, Nodos Anterior_Nodo){
        this.Valor = Elemento;
        this.Nodo_Siguiente = Siguiente_Nodo;
        this.Nodo_Anterior = Anterior_Nodo;
    }
    
    //constructo cuando no hay nodos
    public Nodos(int Elemento){
        this(Elemento, null, null);
    }
    
    
}
