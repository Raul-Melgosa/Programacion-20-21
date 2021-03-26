/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Caso {
    private String numeroExpediente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;
    private Cliente cliente;
    private ArrayList listaAbogados;
    
    public Caso(){
        
    }

    public Caso(String numeroExpediente, LocalDate fechaInicio, LocalDate fechaFin, String estado, Cliente cliente) {
        this.numeroExpediente = numeroExpediente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.cliente = cliente;
        this.listaAbogados=new ArrayList();
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList getListaAbogados() {
        return listaAbogados;
    }

    public void setListaAbogados(ArrayList listaAbogados) {
        this.listaAbogados = listaAbogados;
    }

    @Override
    public String toString() {
        return ""+this.numeroExpediente + "   " + this.estado + "  Inicio: " + this.fechaInicio.toString() + "   Fin: "+this.fechaFin.toString()+"\n";
    }
    
}
