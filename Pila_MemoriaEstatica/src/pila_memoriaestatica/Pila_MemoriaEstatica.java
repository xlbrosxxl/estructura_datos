package pila_memoriaestatica;

import javax.swing.JOptionPane;

public class Pila_MemoriaEstatica {

    public static void main(String[] args) {
        int opcion = 0;
        int elemento;
        int tamaño;
        boolean estado = false;

        try {
            tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));

            Pila pila = new Pila(tamaño);
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion\n"
                        + "1 para agg elemento a la pila\n"
                        + "2 para sacar un elemento de la pila\n"
                        + "3 ¿la pila esta vacia?\n"
                        + "4 ¿la pila esta llena?\n"
                        + "5 elemento del top\n"
                        + "6 tamaño de pila\n"
                        + "7 salir"));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("ingresa el elemento"));
                        if (!pila.Es_Llena()) {
                            pila.push(elemento);
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila esta llena");
                        }
                        break;

                    case 2:
                        if (!pila.Es_Vacia()) {
                            JOptionPane.showMessageDialog(null, "elemento obtenido es " + pila.pop());
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila esta vacia");
                        }
                        break;

                    case 3:
                        if (pila.Es_Vacia()) {
                            JOptionPane.showMessageDialog(null, "la pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila no esta vacia");
                        }
                        break;

                    case 4:
                        if (pila.Es_Llena()) {
                            JOptionPane.showMessageDialog(null, "la pila esta llena");
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila no esta llena, aun tiene espacio");
                        }
                        break;

                    case 5:
                        if (!pila.Es_Vacia()) {
                            JOptionPane.showMessageDialog(null, "el elemento del top es " + pila.peek());
                        }
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "el tamaño de la pila es " + pila.Tamaño());
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "saliste");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta");
                }
            } while (opcion != 7);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error ingrese un numero " + e.getMessage());
        }
    }

}
