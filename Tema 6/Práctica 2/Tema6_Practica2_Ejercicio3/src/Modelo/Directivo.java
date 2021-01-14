/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Directivo extends Empleado
{
    private String categoria;
    
    private ArrayList<Empleado> listaSubordinados;

    public Directivo(String nombre, int edad, double sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getListaSubordinados() {
        return listaSubordinados;
    }

    public void setListaSubordinados(ArrayList<Empleado> listaSubordinados) {
        this.listaSubordinados = listaSubordinados;
    }

    @Override
    public String Mostrar() 
    {
        String nombresSubordinados="";
        if(listaSubordinados.size()!=0)
        {
            for(int x=0; x<this.listaSubordinados.size();x++)
            {
                nombresSubordinados += this.listaSubordinados.get(x).getNombre() + "  ";
            }
        }
        return super.Mostrar() + ", Categoría = " + this.getCategoria() + ", Lista de subordinados: \n" + nombresSubordinados;
    }
}
