package com.mycompany.cajeroautomatico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author erikd
 */
public class CajeroAutomatico {

    public static void main(String[] args) {

        String Titular, opc, opc2, nCuenta,intDinero;
        String idCuenta;
        int o, o2, nC, idC;
        float intD;
        int pos = -1;
        int pos2 = -1;
        
        List<Cuenta> Usuarios = new ArrayList<Cuenta>();
        do{

            opc = JOptionPane.showInputDialog("Bienvenido al Cajero Automatico \n\nElige una Opcion: \n1. Crear Cuenta \n2. Ingresar a Cuenta \n3. Salir");
            o = Integer.parseInt(opc);
            
            switch(o)
            {
                case 1:
                    nCuenta = JOptionPane.showInputDialog("Ingresa el numero de la cuenta");
                    nC = Integer.parseInt(nCuenta);
                    Titular = JOptionPane.showInputDialog("Ingresa el nombre del titular");
                    
                    Usuarios.add(new Cuenta(nC, Titular));
                    
                    break;
                    
                case 2:
                    idCuenta = JOptionPane.showInputDialog("Introduce el numero de la cuenta");
                    idC = Integer.parseInt(idCuenta);
                    
                    for(int i = 0; i < Usuarios.size(); i++)
                    {
                        if(Usuarios.get(i).getCuenta() == idC)
                        {
                            pos = i;
                        }
                    }
                    if(pos != -1)
                    {
                        do{
                            
                        
                        opc2 = JOptionPane.showInputDialog("¡Bienvenido!: \n" + Usuarios.get(pos).getDatos() + "\n\nElige una Opcion: \n1. Ingresar Dinero \n2. Retirar Dinero \n3. Realizar Transferencia"
                                + "\n4. Salir");
                        o2 = Integer.parseInt(opc2);
                        
                        switch (o2) {
                            case 1:
                                intDinero = JOptionPane.showInputDialog("Introduce la cantidad: ");
                                intD = Float.parseFloat(intDinero);
                                Usuarios.get(pos).ingreso(intD);
                                break;
                                
                            case 2:
                                if(Usuarios.get(pos).leerSaldo() != 0)
                                {
                                    intDinero = JOptionPane.showInputDialog("Introduce la cantidad a retirar: ");
                                    intD = Float.parseFloat(intDinero);
                                    Usuarios.get(pos).reintegro(intD);
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                                }
                                
                                break;
                                
                            case 3:
                                idCuenta = JOptionPane.showInputDialog("Introduce el numero de la cuenta a transferir");
                                idC = Integer.parseInt(idCuenta);

                                for(int i = 0; i < Usuarios.size(); i++)
                                {
                                    if(Usuarios.get(i).getCuenta() == idC)
                                    {
                                        pos2 = i;
                                    }
                                }
                                if(pos2 != -1 && Usuarios.get(pos).leerSaldo() != 0)
                                {
                                    intDinero = JOptionPane.showInputDialog("Introduce la cantidad a transferir");
                                    intD = Float.parseFloat(intDinero);
                                    Usuarios.get(pos).reintegro(intD);
                                    Usuarios.get(pos2).ingreso(intD);
                                    JOptionPane.showMessageDialog(null, "Se transfieron: $" + intD + " pesos a la cuenta: " + Usuarios.get(pos2).getCuenta());
                                    
                                }
                                else if(Usuarios.get(pos).leerSaldo() == 0)
                                {
                                    JOptionPane.showMessageDialog(null, "SaldoInsuficiente");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                                }
                                pos2 = -1;          
                                break;
                                
                            case 4:
                                JOptionPane.showMessageDialog(null, "Regresando al menu");
                                break;
                            default:
                                break;
                        }
                        }while(o2 != 4);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Cuenta "+ idC + " no encontrada");
                    }
                    pos = -1;
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar la aplicacion");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida!!");
                    break;
            }
        }while(o != 3);
}
}
class Cuenta
{
    private int numeroCuenta;
    private String titular;
    private float saldo;

    
    public Cuenta(int numeroCuenta, String titular)
    {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        saldo = 0;
    }
    
    public void  ingreso(float cantidad)
    {
        saldo += cantidad;
    }
    
    public void reintegro (float cantidad)
    {
        saldo -=cantidad;
    }
    
    
    public int getCuenta()
    {
        return numeroCuenta;
    }
    
    public float leerSaldo()
    {
        return saldo;
    }
    
    public String getDatos()
    {
        return "\nNumero Cuenta: " + numeroCuenta + "\nTitular: " + titular + "\nSaldo: " + leerSaldo(); 
    }
    
}
