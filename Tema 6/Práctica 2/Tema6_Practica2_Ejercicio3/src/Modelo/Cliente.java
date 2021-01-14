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
public class Cliente extends Persona
{
    private int telefonoDeContacto;

    public Cliente(String nombre, int edad, int telefonoDeContacto) {
        super(nombre, edad);
        this.telefonoDeContacto = telefonoDeContacto;
    }

    public int getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(int telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }
    
    @Override
    public String Mostrar() 
    {
        return super.Mostrar() + ", Teléfono de contacto = " + this.getTelefonoDeContacto();
    }
}
