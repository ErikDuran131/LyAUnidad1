/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilacadenas;

import java.util.Stack;
/**
 *
 * @author erikd
 */
public class PilaCadenas {

    public static void main(String[] args) {
        
        Stack pila = new Stack();
        
        pila.push("Antonio");
        pila.push("Pedro");
        pila.push("Jose");
        pila.push("Maria");
        pila.push("Carlos");
        pila.push("Guadalupe");
        pila.pop();
        System.out.println("El ultimo elemento de la pila es: " + pila.peek());
        pila.push("Juan");
        pila.pop();
        pila.pop();
        System.out.println("El ultimo elemento de la pila es: " + pila.peek());
        
        while(pila.empty() == false)
        {
            System.out.println(pila.pop());
        }
    }
}
