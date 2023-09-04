
package pila_memoriadinamica;

import javax.swing.JOptionPane;

public class Pila_MemoriaDinamica {

    public static void main(String[] args) {
        int opcion = 0;
        int elemento;
        Pila pila = new Pila();
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion\n"
                    + "1 para saber si la pila es vacia\n"
                    + "2 para insertar elementos\n"
                    + "3 para sacar elementos\n"
                    + "4 para saber el elementos del top\n"
                    + "5 para saber el tamaño\n"
                    + "6 para limpiar la pila\n"
                    + "7 para salir"));
            
            switch (opcion) {
                case 1:
                    if(pila.Esta_Vacia()){
                        JOptionPane.showMessageDialog(null, "la pila esta vacia");
                    }else{
                        JOptionPane.showMessageDialog(null, "la pila no esta vacia");
                    }
                    break;
                    
                case 2:
                    elemento = Integer.parseInt(JOptionPane.showInputDialog("ingrese el elemento"));
                    pila.push(elemento);
                    break;
                    
                case 3:
                    if(!pila.Esta_Vacia()){
                        JOptionPane.showMessageDialog(null, "el elemento borradp fue " +pila.pop());
                    }else{
                        JOptionPane.showMessageDialog(null, "la pila esta vacia");
                    }
                    break;
                    
                case 4:
                    if(!pila.Esta_Vacia()){
                        JOptionPane.showMessageDialog(null, "el elemento de la cima es " +pila.peek());
                    }else{
                        JOptionPane.showMessageDialog(null, "la pila esta vacia");
                    }
                    break;
                  
                case 5:
                    JOptionPane.showMessageDialog(null, "el tamaño es "+pila.size());
                    break;
                   
                case 6:
                    if(pila.Esta_Vacia()){
                        JOptionPane.showMessageDialog(null, "la fila ya esta vacia");
                    }else{
                        pila.clear();
                        JOptionPane.showMessageDialog(null, "ya esta limpia la pila");
                    }
                    break;
                    
                case 7:  
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "ingrese una opcion valida");
            }
        } while (opcion != 7);
    }
    
}
