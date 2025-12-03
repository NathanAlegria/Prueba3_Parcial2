/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoria;

import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner lea = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----------Menu----------");
            System.out.println("1. Agregar nodo");
            System.out.println("2. Agregar nodo en posicion");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Obtener nodo por codigo");
            System.out.println("5. Imprimir lista");
            System.out.println("6. Obtener tamaño de la lista");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el codigo del nodo: ");
                    int codigo = lea.nextInt();
                    System.out.print("Ingrese el nombre del nodo: ");
                    String nombre = lea.next();
                    lista.add(new Nodo(codigo, nombre));
                    break;
                case 2:
                    System.out.print("Ingrese el codigo del nodo: ");
                    int codigo2 = lea.nextInt();
                    System.out.print("Ingrese el nombre del nodo: ");
                    String nombre2 = lea.next();
                    System.out.print("Ingrese la posicion: ");
                    int index = lea.nextInt();
                    try {
                        lista.add(index, new Nodo(codigo2, nombre2));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indice fuera de rango.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el codigo del nodo a eliminar: ");
                    int codigoEliminar = lea.nextInt();
                    if (lista.remove(codigoEliminar)) {
                        System.out.println("Nodo eliminado.");
                    } else {
                        System.out.println("No se encontro el nodo.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el codigo del nodo a buscar: ");
                    int codigoBuscar = lea.nextInt();
                    Nodo nodoEncontrado = lista.get(codigoBuscar);
                    if (nodoEncontrado != null) {
                        System.out.println("Nodo encontrado: " + nodoEncontrado);
                    } else {
                        System.out.println("No se encontro el nodo.");
                    }
                    break;
                case 5:
                    System.out.println("Lista:");
                    lista.print();
                    break;
                case 6:
                    System.out.println("Tamaño de la lista: " + lista.size());
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
            System.out.println("--------------------------------");
        } while (opcion != 7);
    }
}
