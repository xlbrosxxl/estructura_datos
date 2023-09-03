
public class Nodo {
    int dato;
    Nodo Siguiente_Nodo;
    
    //contructor para insertar al final
    public Nodo(int valor){
       this.dato = valor;
       this.Siguiente_Nodo = null;
    }
    
    //constructor para nodo inicio
    public Nodo(int valor, Nodo nodo){
      this.dato = valor;
      this.Siguiente_Nodo = nodo;
    }
}
