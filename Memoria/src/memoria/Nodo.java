/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memoria;

/**
 *
 * @author Nathan
 */
public class Nodo {
    public int codigo;
    public String nombre;
    public Nodo sigte;
    
    public Nodo(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
        sigte=null;
    }
    
    public String toString(){
     return "Nodo{"+"Codigo: "+codigo+", Nombre: "+nombre+"}";   
    }
}
