
import javax.swing.JOptionPane;


public class Lista {
    Nodo cabeza; //puntero inicio
    Nodo cola; //puntero cola
    
    public Lista(){
        this.cabeza = null;
        this.cola = null;
    }
    
    //metodo para agregar al inicio
    public void Agregar_Inicio(int Elemento){
        //crear nodo
        cabeza = new Nodo(Elemento, cabeza);
        if(cola == null){
            cola = cabeza;
        }
    }
    
    //metodo para saber si esta vacia la lista
    public boolean Esta_Vacia(){
        if(cabeza == null){
            return true;
        }else{
            return false;
        }
    }
    
    //metodo para insertar al final de la lista
    public void Agregar_Final(int Elemento){
        if(!Esta_Vacia()){
            cola.Siguiente_Nodo = new Nodo(Elemento);
            cola = cola.Siguiente_Nodo;
        }else{
            cabeza = new Nodo(Elemento);
            cola = new Nodo(Elemento);
        }
    }
    
    //metodo para mostrar los datos
    public void Mostrar_Lista(){
        Nodo Recorrer = cabeza;
        System.out.println();
        while(Recorrer != null){
            System.out.print("["+Recorrer.dato+"]-->");
            Recorrer = Recorrer.Siguiente_Nodo;
        }
    }
    
    //metodo para borrar del inicio
    public int Borrar_Inicio(){
        int Elemento = cabeza.dato;
        if(cabeza == cola){
            cabeza = null;
            cola = null;
        }else{
            cabeza = cabeza.Siguiente_Nodo;
        }
        return Elemento;
    }
    
    //metodo para eliminar nodo del final
    public int Borrar_Final(){
        int Elemento = cola.dato;
        if(cabeza == cola){
            cabeza = null;
            cola = null;
        }else{
            Nodo auxiliar = cabeza;
            while(auxiliar.Siguiente_Nodo != cola){
                auxiliar = auxiliar.Siguiente_Nodo;
            }
            cola = auxiliar;
            cola.Siguiente_Nodo = null;
        }
        return Elemento;
    }
    
    //metodo para eliminar un nodo en especifico
    public void Elimar_Nodo(int Elemento){
        if(!Esta_Vacia()){
            if(cabeza == cola && Elemento == cabeza.dato){
                cabeza = null;
                cola = null;
            }else if(Elemento == cabeza.dato){
                cabeza = cabeza.Siguiente_Nodo;
                
            }else{
                Nodo anterior;
                Nodo temporal;
                
                anterior = cabeza;
                temporal = cabeza.Siguiente_Nodo;
                
                while(temporal != null && temporal.dato!=Elemento){
                    anterior = anterior.Siguiente_Nodo;
                    temporal = temporal.Siguiente_Nodo;
                }
                if(temporal!=null){
                    anterior.Siguiente_Nodo = temporal.Siguiente_Nodo;
                    if(temporal == cola){
                        cola = anterior;
                    }
                }
            }
        }
    }
    
    //metodo para buscar nodo
    public boolean Buscar_Nodo(int Elemento){
        Nodo temporal = cabeza;
        while(temporal != null && temporal.dato != Elemento){
            temporal = temporal.Siguiente_Nodo;
        }
        return temporal != null;
    }
}
