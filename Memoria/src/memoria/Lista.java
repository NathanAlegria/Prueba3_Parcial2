/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoria;

/**
 *
 * @author Nathan
 */
public class Lista {

    private Nodo inicio = null;
    private int size = 0;

    public boolean isEmpty() {
        return inicio == null;
    }

    public void add(Nodo obj) {
        if (obj == null) {
            return;
        }
        if (isEmpty()) {
            inicio = obj;
        } else {
            Nodo tmp = inicio;

            while (tmp.sigte != null) {
                tmp = tmp.sigte;
            }

            tmp.sigte = obj;
        }
        size++;
    }

    public void print() {
        Nodo tmp = inicio;

        while (tmp != null) {
            System.out.println(tmp.toString());
            tmp = tmp.sigte;
        }
    }

    public Nodo get(int code) {
        Nodo tmp = inicio;
        while (tmp != null) {
            if (tmp.codigo == code) {
                return tmp;
            }
            tmp = tmp.sigte;
        }
        return null;
    }

    public boolean remove(int codigo) {
        if (isEmpty()) {
            return false;
        }

        if (inicio.codigo == codigo) {
            inicio = inicio.sigte;
            size--;
            return true;
        }

        Nodo tmp = inicio;
        while (tmp.sigte != null) {
            if (tmp.sigte.codigo == codigo) {
                tmp.sigte = tmp.sigte.sigte;
                size--;
                return true;
            }
            tmp = tmp.sigte;
        }

        return false;
    }

    public void add(int index, Nodo obj) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            obj.sigte = inicio;
            inicio = obj;
        } else {
            Nodo tmp = inicio;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.sigte;
            }
            obj.sigte = tmp.sigte;
            tmp.sigte = obj;
        }
        size++;
    }

    public int size() {
        return size;
    }
}
