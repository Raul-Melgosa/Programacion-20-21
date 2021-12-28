/// <reference path="Copia.ts"/>
/// <reference path="Multa.ts"/>
/// <reference path="Prestamo.ts"/>



class Lector {
    private nSocio: string;
    private nombre: string;
    private telefono: string;
    private direccion: string;
    private multa: Multa;
    private prestamo: Prestamo;
    
    constructor(nombre: string, telefono: string, direccion: string) {
        this.nSocio = Copia.generarId();
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.multa = null;
        this.prestamo = null;
    }

    public getNSocio(): string {
        return this.nSocio;
    }
    
    public getPrestamo(): Prestamo {
        return this.prestamo;
    }
    public setPrestamo(value: Prestamo) {
        this.prestamo = value;
    }

    public getNombre(): string {
        return this.nombre;
    }
    public setNombre(value: string) {
        this.nombre = value;
    }
    
    public getTelefono(): string {
        return this.telefono;
    }
    public setTelefono(value: string) {
        this.telefono = value;
    }
    
    public getDireccion(): string {
        return this.direccion;
    }
    public setDireccion(value: string) {
        this.direccion = value;
    }

    public getMulta(): Multa {
        return this.multa;
    }
    public setMulta(value: Multa) {
        this.multa = value;
    }


    public gestionMulta():boolean {
        if(this.multa != null) {
            if(this.multa.getFFin() < new Date()) {
                this.multa=null;
                return true;
            } else if(this.multa.getFFin() > new Date()) {
                return false;
            }
        }
        else {
            return true;
        }
    }

    public multar(dias:number) {
        let fechaFin:Date = new Date();
        fechaFin.setDate(fechaFin.getDate()+dias);
        
        this.multa = new Multa(new Date(),fechaFin);
    }


    public devolver(id:string, lista:[], fechaAct:Date=new Date()):boolean {
        if (lista.length!=0) {
            let encontrado:boolean = false;
            for (let x = 0; x<lista.length && !encontrado; x++) {
                let libro:Copia = lista[x];
                if(libro.getId() == id) {
                    if(this.prestamo.getFin() < new Date()) {
                        this.multar(7);
                    }
                    libro.setEstado(2); //prestado=0,retraso=1,biblioteca=2,reparacion=3
                    encontrado = true;
                }
            }
            return encontrado;
        }
        else {
            return false;
        }
    }


    public prestar(id:string, fechaAct:Date=new Date()):boolean {
        if (this.prestamo != null && this.multa==null) {
            
        }
        else {
            return false;
        }
    }
}