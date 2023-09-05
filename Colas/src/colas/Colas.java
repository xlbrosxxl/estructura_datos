
package colas;

import javax.swing.JOptionPane;

public class Colas {

    public static void main(String[] args) {
        int opcion = 0;
        int elemento;
        Cola cola = new Cola();
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion del menu\n"
                    + "1 para agregar un elemento\n"
                    + "2 para quitar elemento\n"
                    + "3 para saber si esta vacia la cola\n"
                    + "4 para saber el tamaño de la cola\n"
                    + "5 para saber el dato de top\n"
                    + "6 para salir"));
            
            switch (opcion) {
                case 1:
                    elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento nuevo"));
                    cola.Insertar(elemento);
                    break;
                    
                case 2:
                    if(!cola.Es_Vacia()){
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es "+cola.Quitar());
                    }else{
                        JOptionPane.showMessageDialog(null, "la cola esta vacia");
                    }
                    break;
                    
                case 3:
                    if(!cola.Es_Vacia()){
                        JOptionPane.showMessageDialog(null, "No esta vacia");
                    }else{
                        JOptionPane.showMessageDialog(null, "la cola esta vacia");
                    }
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "el tamaño de la cola es "+cola.size());
                    break;
                    
                case 5:
                    if(!cola.Es_Vacia()){
                        JOptionPane.showMessageDialog(null, "el elemento en el top es "+cola.Top());
                    }else{
                        JOptionPane.showMessageDialog(null, "cola vacia");
                    }
                    break;
                    
                case 6:
                    JOptionPane.showMessageDialog(null, "app cerrada");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "ingrese una opcion valida");
            }
        } while (opcion != 6);
    }
    
}
