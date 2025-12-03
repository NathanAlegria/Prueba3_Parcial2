/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memoria;

/**
 *
 * @author Nathan
 */

public class Lista {
    private Nodo inicio=null;
    private int size=0;

    public boolean isEmpty(){
        return inicio==null;
    }

    public void add(Nodo obj){
        if(obj==null){
            return;
        }
      if(isEmpty()){
          inicio=obj;
      }  else{
          Nodo puntero=inicio;

          while(puntero.sigte!=null){
              puntero=puntero.sigte;
          }

          puntero.sigte=obj;
      }
      size++;
    }

    public void add(int index, Nodo obj){
        if(index > size){
            throw new IndexOutOfBoundsException();
        }

        if(index == 0){
            obj.sigte = inicio;
            inicio = obj;
        } else {
            Nodo puntero = inicio;
            for(int i = 0; i < index - 1; i++){
                puntero = puntero.sigte;
            }
            obj.sigte = puntero.sigte;
            puntero.sigte = obj;
        }
        size++;
    }

    public void print(){
        Nodo puntero = inicio;

        while (puntero != null) {
            System.out.println(puntero.toString());
            puntero = puntero.sigte;
        }
    }

    public Nodo get(int code){
        Nodo puntero=inicio;
        while(puntero != null){
            if(puntero.codigo==code){
                return puntero;
            }
            puntero=puntero.sigte;
        }
        return null;
    }

    public boolean remove(int codigo){
        if(isEmpty()){
            return false;
        }

        if(inicio.codigo == codigo){
            inicio = inicio.sigte;
            size--;
            return true;
        }

        Nodo puntero = inicio;
        while(puntero.sigte != null){
            if(puntero.sigte.codigo == codigo){
                puntero.sigte = puntero.sigte.sigte;
                size--;
                return true;
            }
            puntero = puntero.sigte;
        }

        return false;
    }

    public int size(){
        return size;
    }
}

