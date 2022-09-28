/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilametodos;

import java.util.Stack;
/**
 *
 * @author erikd
 */
public class Pilametodos {

    public static void main(String[] args) {
        
        /** push agregar dato
         * pop extraer pila
         * peek ver ultimo dato de la pila
         * empty saber si tiene o no tiene datos la pila
         */
        
        Stack pila = new Stack();
        pila.push("juan");
        pila.push(50);
        pila.push("Cadena");
        pila.push(49);
        pila.push(51);
        pila.pop();
        pila.pop();
        pila.push(100.5);
        System.out.println("El ultimo elemento de la pila es: " + pila.peek());
        while(pila.empty() == false)
        {
            System.out.println(pila.pop());
        }
    
    }
}
