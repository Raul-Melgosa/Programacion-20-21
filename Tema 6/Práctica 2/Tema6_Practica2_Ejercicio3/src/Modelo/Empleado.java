/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 1GDAW09
 */
public class Empleado extends Persona
{
    private double sueldoBruto;

    public Empleado(String nombre, int edad, double sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    public double calcularSalarioNeto()
    {
        double salarioNeto = this.getSueldoBruto();
        salarioNeto *= 0.6;
        return salarioNeto;
    }

    @Override
    public String Mostrar() 
    {
        return super.Mostrar() + ", Sueldo bruto = " + this.getSueldoBruto();
    }
    
    
}
