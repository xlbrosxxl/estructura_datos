
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        
        int opcion = 0;
        int elemento;
        Lista lista = new Lista();
        do {
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese la opcion\n"
                        + "1 elemento al inicio\n"
                        + "2 para recorrer la lista\n"
                        + "3 para agregar al final\n"
                        + "4 para eliminar nodo de inicio\n"
                        + "5 para eliminar nodo del final\n"
                        + "6 para eliminar un elementos especifico\n"
                        + "7 para buscar un elemento\n"
                        + "8 para salir"));
                
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("ingresa el elemento"));
                        //agregando al inicio
                        lista.Agregar_Inicio(elemento);
                        break;
                        
                    case 2:
                        lista.Mostrar_Lista();
                        break;
                        
                    case 3:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("ingresa el elemento"));
                        //agregando al inicio
                        lista.Agregar_Final(elemento);
                        break;
                    
                    case 4:
                        elemento = lista.Borrar_Inicio();
                        JOptionPane.showMessageDialog(null, elemento);
                        break;
                    
                    case 5:
                        elemento = lista.Borrar_Final();
                        JOptionPane.showMessageDialog(null, elemento);
                        break;
                    
                    case 6:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("ingrese el elemento "
                                + "a eliminar"));
                        if(lista.Buscar_Nodo(elemento)){
                            lista.Elimar_Nodo(elemento);
                            JOptionPane.showMessageDialog(null, "el elemento eliminado es " +elemento);
                        }else{
                            JOptionPane.showMessageDialog(null, "el elemento "+elemento+" no esta en la lista");
                        }
                        
                        break;
                        
                    case 7:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("ingrese el elemento"
                                + "a buscar"));
                        if(lista.Buscar_Nodo(elemento)){
                            JOptionPane.showMessageDialog(null, "el elemento "+elemento+" si esta en la lista" );
                            
                        }else{
                            JOptionPane.showMessageDialog(null,"el elemento "+elemento+" no esta en la lista" );
                        }
                        break;
                        
                    case 8:
                        break;
                    default:
                        System.out.println("ingrese opcion valida");
                    
                }
            }catch(Exception ex){
                System.out.println("error");
            }
        } while (opcion != 8);
    }
}
