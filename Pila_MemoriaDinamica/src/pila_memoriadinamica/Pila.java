
package pila_memoriadinamica;

public class Pila {
    Nodo_Pila top;
    int tamaño;
    
    public Pila(){
        this.top = null;
        this.tamaño = 0;
    }
    
    //Metodo para saber cuando la pila esta vacia
    public boolean Esta_Vacia(){
        return top == null;
    }
    
    //metodo para insertar elemento
    public void push(int Elemento){
        Nodo_Pila Nodo = new Nodo_Pila(Elemento);
        Nodo.Siguiente_Nodo = top;
        top = Nodo;
        tamaño++;
    }
    
    //metodo para sacar elementos
    public int pop(){
        int auxiliar = top.dato;
        top = top.Siguiente_Nodo;
        tamaño--;
        return auxiliar;
    }
    
    //metodo para que elemento esta en top
    public int peek(){
        return top.dato;
    }
    
    //metodo para saber el tamaño de la pila
    public int size(){
        return tamaño;
    }
    
    //metodo para limpiar la pila
    public void clear(){
        while(!Esta_Vacia()){
            pop();
        }
    }
}
