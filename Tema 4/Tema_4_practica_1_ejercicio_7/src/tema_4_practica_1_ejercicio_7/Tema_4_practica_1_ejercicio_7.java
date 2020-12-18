/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_4_practica_1_ejercicio_7;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema_4_practica_1_ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            double coste = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de la compra"));
            double pago = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dinero que ha pagado el cliente"));
            double totalDevolver = pago-coste;
            int[] billetes = {5,10,20,50,100,200,500};
            double[] monedas = {0.01, 0.02, 0.05, 0.10, 0.20, 0.50, 1, 2};
            if(pago-coste==0){
                JOptionPane.showMessageDialog(null, "El pago ha sido exacto, no se ha de devolver nada");
            }
            else{
                if(pago-coste>0){
                    calcularVueltas(totalDevolver, billetes, monedas);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error con " + e.getClass() + " con el mensaje " + e.getMessage());
        }
    }

    public static void calcularVueltas(double devolver, int[] billetes, double[] monedas) throws Exception{
        String vueltas="";
        int varios=1;
        for (int x=billetes.length-1 ; x>=0 && devolver>0 ; x--){
            if(devolver-billetes[x]>=0){                                                      
                varios=(int)devolver/billetes[x];
                vueltas += varios + " billetes de " + billetes[x] + " euros\n";
                devolver -= billetes[x]*varios;
            }
        }
        for (int x=monedas.length-1 ; x>=0 && devolver>0 ; x--){
            
            if(devolver-monedas[x]>=0.00){
                if(devolver-monedas[x]<=monedas[x]){
                    vueltas += "1 moneda de " + monedas[x] + " euros\n";
                    devolver -= monedas[x];
                    devolver = Math.rint(devolver*100)/100;
                }else{
                    if(devolver-monedas[x]>=monedas[x]){
                        vueltas += "2 monedas de " + monedas[x] + " euros\n";
                        devolver -= monedas[x]*2; 
                        devolver = Math.rint(devolver*100)/100;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, vueltas);
    }
}
