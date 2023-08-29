public class Lista_Enlazada {
    Nodo cabeza;
    Nodo cola;
    
    public Lista_Enlazada(Nodo Primer_Nodo){
        cabeza = Primer_Nodo;
        cola = cabeza;
    }
    
    public void Insertar_Nodo_Final(Nodo Nuevo_Nodo){
        cola.Siguiente_Nodo = Nuevo_Nodo;
        cola = cola.Siguiente_Nodo;
    }
    
    public void Eliminar_Nodo(Nodo Nodo_Borrable){
        Nodo_Borrable.Siguiente_Nodo = null;
    }
    
    public Nodo Buscar_Nodo(int Valor_Buscar){
        Nodo nodoActual = cabeza;
        
        while(nodoActual != null){
            if(nodoActual.valor == Valor_Buscar){
                return nodoActual;
            }else{
                nodoActual = nodoActual.Siguiente_Nodo;
            }
        }
        return null;
    }
    
    public void Eliminar_Nodo_ConValor(int Valor){
       Nodo NodoABorrar = Buscar_Nodo(Valor);
       if(NodoABorrar != null){
           NodoABorrar.Siguiente_Nodo = null;
       }
    }
}
