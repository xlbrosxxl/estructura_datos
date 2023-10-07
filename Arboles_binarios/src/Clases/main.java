
package Clases;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int opcion = 0;
        int elemento;
        String nombre;
        Arbol_binario arbol = new Arbol_binario();
        
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1 para nuevo nodo\n"
                        +"2 para recorrer el arbol\n"
                        +"3 para salir"));
                
                
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero del nodo"));
                        nombre = JOptionPane.showInputDialog("ingrese el nombre del nodo");
                        arbol.agregarNodo(elemento, nombre);
                        break;
                    
                    case 2:
                        if(!arbol.EstaVacio()){
                          arbol.inorden(arbol.root);
                        }else{
                            System.out.println("esta vacio");
                        }
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null, "saliste del programa");
                        break;
                        
                    default:
                        System.out.println("ingrese una opcion validad");
                }
                
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "error" + e.getMessage());
            }
        } while (opcion !=3);
    }
}
