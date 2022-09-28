/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilanumeros;

import java.util.Stack;
/**
 *
 * @author erikd
 */
public class PilaNumeros {

    public static void main(String[] args) {
        
        Stack pila = new Stack();
        pila.push(15);
        pila.push(10);
        pila.push(5);
        pila.push(8);
        pila.push(20);
        pila.push(30);
        pila.push(50);
        pila.push(2);
        pila.pop();
        pila.pop();
        System.out.println("El ultimo elemento de la pila es: " + pila.peek());
        pila.pop();
        pila.push(40);
        System.out.println("El ultimo elemento de la pila es: " + pila.peek());
        pila.pop();
        pila.pop();
        pila.pop();
        System.out.println("El ultimo elemento de la pila es: " + pila.peek());
        

        while(pila.empty() == false)
        {
            System.out.println(pila.pop());
        }
    }
}
