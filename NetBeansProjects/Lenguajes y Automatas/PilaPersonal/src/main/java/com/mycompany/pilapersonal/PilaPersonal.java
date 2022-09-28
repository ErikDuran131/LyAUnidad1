/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilapersonal;

/**
 *
 * @author erikd
 */
public class PilaPersonal {

    public static void main(String[] args) {
    
            int tamaño = 9;
            int dato = 0;
            
            Pila a = new Pila(tamaño);
            
            a.Insertar(dato = 15);
            a.Insertar(dato = 10);
            a.Insertar(dato = 5);
            a.Insertar(dato = 8);
            a.Insertar(dato = 20);
            a.Insertar(dato = 30);
            a.Insertar(dato = 50);
            a.Insertar(dato = 2);
            
            a.Eliminar();
            a.Eliminar();
            System.out.println("El ultimo elemento de la pila es: " + a.UltimoDato());
            a.Eliminar();
            a.Insertar(dato = 40);
            System.out.println("El ultimo elemento de la pila es: " + a.UltimoDato());
            a.Eliminar();
            a.Eliminar();
            a.Eliminar();
            System.out.println("El ultimo elemento de la pila es: " + a.UltimoDato());
            a.ImprimirDatos();
            
            
    
    }


}
