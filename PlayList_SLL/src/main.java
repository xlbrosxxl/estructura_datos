
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int opcion = 0;
        String cancion;
        SinglyLinkedList list = new SinglyLinkedList();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\tMenu\n"
                    + "1 para agregar canciones\n"
                    + "2 para eliminar canciones\n"
                    + "3 para buscar canciones\n"
                    + "4 para reproducir en forma lineal\n"
                    + "5 para reproducir en forma aletoria\n"
                    + "6 para mostrar la lista de reproducion\n"
                    + "7 para limpiar la lista\n"
                    + "8 para saber el tamaño de la lista\n"
                    + "9 para salir"));

            switch (opcion) {
                case 1:
                    cancion = JOptionPane.showInputDialog("Ingrese la cancion que quiere agregar");
                    list.appendNode(new ListNode(cancion));
                    break;
                
                //ERROR
                case 2:
                    int posicion;
                    posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar"));
                    list.deleteNode(posicion);
                    break;
                
                //ERROR
                case 3:
                    int Busqueda;
                    Busqueda = Integer.parseInt(JOptionPane.showInputDialog("eliga el numero a buscar"));
                    if (!list.isEmpty()) {
                        if (list.findNode(Busqueda)) {
                            JOptionPane.showMessageDialog(null, "esta");
                        } else {
                            JOptionPane.showMessageDialog(null, "No esta");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "la lista esta vacia");
                    }
                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    list.printList();
                    break;

                case 7:

                    break;

                case 8:
                    JOptionPane.showMessageDialog(null, "El tamaño de la lista es " + list.getNumElements());
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "app cerrada");
                    break;
            }

        } while (opcion != 9);
    }

}
