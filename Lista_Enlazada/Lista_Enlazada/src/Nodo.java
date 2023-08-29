public class Nodo {
    int valor;
    Nodo Siguiente_Nodo;
    Nodo Anterior_Nodo;

    public Nodo(int x){
        valor = x;
        Siguiente_Nodo = null;
        Anterior_Nodo = null;
    }
    
    public void Agregar_Siguiente_Nodo(Nodo Nodo_Siguiente){
        this.Siguiente_Nodo = Nodo_Siguiente;
    }
    
    public void Agregar_Anterior_Nodo(Nodo Nodo_Anterior){
        this.Anterior_Nodo = Nodo_Anterior;
    }
    
    public int Actualizar_Valor(int Nuevo_Valor){
        this.valor = Nuevo_Valor;
        return this.valor;
    }
    
    
}
