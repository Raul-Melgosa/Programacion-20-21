/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Caso {
    private String numeroExpediente;
    private Cliente cliente;
    private ArrayList listaAbogados;

    public Caso(String numeroExpediente, Cliente cliente) {
        this.numeroExpediente = numeroExpediente;
        this.cliente = cliente;
        this.listaAbogados=new ArrayList();
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
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
    
    
}
