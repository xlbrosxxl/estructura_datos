

package pila_memoriaestatica;

public class Pila {
    int VectorPila[];
    int top;
    
    //constructor
    public Pila(int Tamaño_Vector){
        this.VectorPila = new int [Tamaño_Vector];
        this.top = -1;
    }
    
    //metodo push
    public void push(int dato){
        top++;
        VectorPila[top] = dato;
    }
    
    //metodo pop
    public int pop(){
        int fuera = VectorPila[top];
        top--;
        return fuera;
    }
    
    //metodo para saber si la pila esta vacia
    public boolean Es_Vacia(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    
    //metodo para saber si la pila esta llena
    public boolean Es_Llena(){
        if(VectorPila.length-1 == top){
            return true;
        }else{
            return false;
        }
    }
    
    //metodo para saber cual es la cima
    public int peek(){
        return VectorPila[top];
    }
    
    //metodo para saber el tamaño de la pila
    public int Tamaño(){
        return VectorPila.length;
    }
}
