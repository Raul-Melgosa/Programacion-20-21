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
public class Cuenta {
    private String numeroDeCuenta;
    private double saldo;
    private ArrayList<Movimiento> listaMovimientosCuenta;

    public Cuenta(String numeroDeCuenta, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public Cuenta(String numeroDeCuenta, double saldo, ArrayList<Movimiento> listaMovimientosCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.listaMovimientosCuenta = listaMovimientosCuenta;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Movimiento> getListaMovimientosCuenta() {
        return listaMovimientosCuenta;
    }

    public void setListaMovimientosCuenta(ArrayList<Movimiento> listaMovimientosCuenta) {
        this.listaMovimientosCuenta = listaMovimientosCuenta;
    }

    
    
    
}
