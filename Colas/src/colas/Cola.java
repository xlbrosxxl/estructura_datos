
package colas;

public class Cola {
   Nodo_Colas cabeza;
   Nodo_Colas cola;
   int tamaño;
   
   public Cola(){
       this.cabeza = null;
       this.cola = null;
       this.tamaño = 0;
   }
   
   //metodo para saber si es vacia
   public boolean Es_Vacia(){
       return cabeza == null;
   }
   
   //metodo para insertar
   public void Insertar(int Elemento){
       Nodo_Colas nuevo = new Nodo_Colas(Elemento);
       if(Es_Vacia()){
           cabeza = nuevo;
       }else{
           cola.Siguiente_Nodo = nuevo;
       }
       cola = nuevo;
       tamaño++;
   }
   
   //metodo para eliminar
   public int Quitar(){
       int auxiliar = cabeza.dato;
       cabeza = cabeza.Siguiente_Nodo;
       tamaño--;
       return auxiliar;
   }
   
   //metodo para saber el top de cola
   public int Top(){
       return cabeza.dato;
   }
   
   //metodo tamaño de cola
   public int size(){
       return tamaño;
   }
}
