/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author erikd
 */
public class Nodo {
    private String dato;
    private Nodo izquierda;
    private Nodo derecha;
    
    public Nodo(String dato){
        this.dato=dato;
        this.izquierda=null;
        this.derecha=null;
    }
    public String getDato(){
        return dato;
    }
    public void setDato(String dato){
        this.dato = dato;
    }
    public Nodo getIzquierda(){
        return izquierda;
    }
    public void setIzquierda(Nodo izquierda){
        this.izquierda = izquierda;
    }
    public Nodo getDerecha(){
        return derecha;
    }
    public void setDerecha(Nodo derecha){
        this.derecha = derecha;
    }
}
