/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1GDAW09
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularLongitud()
    {
        return (this.radio*2*Math.PI);
    }
    
    public double calcularArea()
    {
        return (this.radio*this.radio*Math.PI);
    }
    
    public double calcularVolumenEsfera()
    {
        return (4/3*Math.PI*this.radio*this.radio*this.radio);
    }
    
}
