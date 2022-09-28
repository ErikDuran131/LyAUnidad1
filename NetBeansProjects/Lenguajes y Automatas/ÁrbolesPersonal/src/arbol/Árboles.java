/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbol;

/**
 *
 * @author erikd
 */
public class Árboles {

        private Nodo raiz;
        private String cad="";
        private int cont=0;
        
        public Árboles(String dato){
            raiz = new Nodo(dato);
            raiz.setIzquierda(null);
            raiz.setDerecha(null);
        }
        public void insertarIzquierda(String dato, Nodo ref){
            if(ref!=null){
                Nodo nuevo=new Nodo(dato);
                ref.setIzquierda(nuevo);
            }
        }
        public void insertarDerecha(String dato, Nodo ref){
            if(ref!=null){
                Nodo nuevo = new Nodo(dato);
                ref.setDerecha(nuevo);
            }
        }
        public String niveles(Nodo ref){
            if(ref!=null){
                if(ref==raiz){
                    cad="";
                }
                cad=cad+" "+ref.getDato();
                niveles(ref.getIzquierda());
                niveles(ref.getDerecha());
            }
            return cad;
        }
        public String preOrden(Nodo ref){
            if(ref!=null){
                if(ref==raiz){
                    cad="";
                }
                cad=cad+" "+ref.getDato();
                preOrden(ref.getIzquierda());
                preOrden(ref.getDerecha());
            }
            return cad;
        }
        public String inOrden(Nodo ref){
            if(ref!=null){
                if(ref==raiz){
                    cad="";
                }
                inOrden(ref.getIzquierda());
                cad=cad+""+ref.getDato();
                inOrden(ref.getDerecha());
            }
            return cad;
        }
        public String posOrden(Nodo ref){
            if(ref!=null){
                if(ref==raiz){
                    cad="";
                }
                posOrden(ref.getIzquierda());
                posOrden(ref.getDerecha());
                cad=cad+""+ref.getDato();
            }
            return cad;
        }
        public Nodo getRaiz(){
            return raiz;
        }
        
    }
