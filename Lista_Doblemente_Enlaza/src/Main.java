
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Lista_Doble_Enlazada lista = new Lista_Doble_Enlazada();
        int opcion = 0;
        int elemento;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1 para agregar un nodo al inicio\n"
                + "2 para agregar nodo al final\n"
                        + "3 mostrar la lista de inicio a fin\n"
                        + "4 mostrar la lista de fin a inicio\n"
                        + "5 para eliminar nodo del inicio\n"
                        + "6 para eliminar nodo del final\n"
                        + "7 para salir", "Menu"
                        , JOptionPane.INFORMATION_MESSAGE));
                
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("null", "Ingresa el elemento del nodo"));
                        lista.Agregar_Nodo_Inicio(elemento);
                        break;
                        
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("null", "Ingresa el elemento del nodo"));
                        lista.Agregar_Nodo_Final(elemento);
                        break;
                        
                    case 3:
                        if(!lista.EsVacia()){
                            lista.Mostar_Lista_Orden();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos, ingrese al menos uno");
                        }
                        break;
                        
                    case 4:
                        if(!lista.EsVacia()){
                            lista.Mostar_Lista_SinOrden();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos, ingrese al menos uno");
                        }
                        break;
                    
                    case 5:
                        if(!lista.EsVacia()){
                            elemento = lista.Eliminar_Nodo_Inicio();
                            JOptionPane.showMessageDialog(null, "se elimino " + elemento);
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos, ingrese al menos uno");
                        }
                        break;
                    
                    case 6:
                        if(!lista.EsVacia()){
                            elemento = lista.Eliminar_Nodo_Final();
                            JOptionPane.showMessageDialog(null, "se elimino " + elemento);
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos, ingrese al menos uno");
                        }
                        break;
                        
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion cerrada","Finn",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "la opcion no est en el menu");
                        
                }
            } catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "error"+n.getMessage());
            }
        } while (opcion != 7);
    }
}
